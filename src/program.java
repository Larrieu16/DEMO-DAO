import model.dao.daoFactory;
import model.dao.sellerDao;
import modelEntities.department;
import modelEntities.seller;

import java.util.Date;
import java.util.List;

public class program {
    public static void main(String[] args){
        sellerDao sellerDao = daoFactory.createSellerDao();

        System.out.println("TEST 1: seller findById");
        seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 1: seller findByDepartment" );
        department department = new department(2, null);
        List<seller> list = sellerDao.findByDepartment(department);
        for(seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\nTEST 1: seller findByDepartment" );
        list = sellerDao.findAll();
        for(seller obj : list) {
            System.out.println(obj);
        }
    }
}
