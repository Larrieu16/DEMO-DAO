import model.dao.daoFactory;
import model.dao.sellerDao;
import modelEntities.department;
import modelEntities.seller;

import java.util.Date;

public class program {
    public static void main(String[] args){
        sellerDao sellerDao = daoFactory.createSellerDao();

        System.out.println("TEST 1: seller findById");
        seller seller = sellerDao.findById(3);



        System.out.println(seller);
    }
}
