import model.dao.daoFactory;
import model.dao.sellerDao;
import modelEntities.department;
import modelEntities.seller;

import java.util.Date;

public class program {
    public static void main(String[] args){
        sellerDao sellerDao = daoFactory.createSellerDao();
        seller seller = sellerDao.findById(3);



        System.out.println(seller);
    }
}
