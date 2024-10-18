package model.dao;

import impl.sellerDaoJDBC;

public class daoFactory {
    public static sellerDao createSellerDao{
        return new sellerDaoJDBC;
    }
}
