package impl;
import db.DB;
import db.DbException;
import model.dao.sellerDao;
import modelEntities.department;
import modelEntities.seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class sellerDaoJDBC implements sellerDao{
    private Connection conn;
    public sellerDaoJDBC(Connection conn){
        this.conn = conn;
    }
    public void insert(seller obj){
    }
    public void update(seller obj){}

    public void deleteById(Integer id){

    }
    public seller findById(Integer id){
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st=conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "+
                    "FROM seller INNER JOIN department "+
                    "ON seller.DepartmentId = department.Id "+
                    "WHERE seller.Id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if(rs.next()){
                department dep = instanciateDepartment(rs);
                seller obj = instanciateSeller(rs, dep);
                return obj;
            }
            return null;
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private seller instanciateSeller(ResultSet rs, department dep) throws SQLException{
        seller obj = new seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
    }

    private department instanciateDepartment(ResultSet rs) throws SQLException{
        department dep = new department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        return dep;
    }

    @Override
    public List<seller> findAll() {
        return null;
    }


}
