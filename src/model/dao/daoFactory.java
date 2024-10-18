package model.dao;

import db.DB;
import impl.sellerDaoJDBC;

public class daoFactory {
    public static sellerDao createSellerDao(){
        return new sellerDaoJDBC(DB.getConnection());
    }
}
