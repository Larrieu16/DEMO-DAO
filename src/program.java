import model.dao.daoFactory;
import model.dao.sellerDao;
import modelEntities.department;
import modelEntities.seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        sellerDao sellerDao = daoFactory.createSellerDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("TEST 1: seller findById");
        seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 2: seller findByDepartment" );
        department department = new department(2, null);
        List<seller> list = sellerDao.findByDepartment(department);
        for(seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\nTEST 3: seller findAll" );
        list = sellerDao.findAll();
        for(seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nTEST 4: seller insert" );
        seller newSeller = new seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID = " + newSeller.getId());

        System.out.println("\nTEST 5: seller update" );
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update Completed! ");

        System.out.println("\nTEST 6: seller delete" );
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed! ");
        sc.close();

    }
}

