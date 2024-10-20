package model.dao;

import db.DB;
import impl.departmentDaoJDBC;
import impl.sellerDaoJDBC;

public class daoFactory {
    public static sellerDao createSellerDao(){

        return new sellerDaoJDBC(DB.getConnection());
    }
    public static departmentDao createDepartmentDao(){
        return new departmentDaoJDBC(DB.getConnection());
    }
}
