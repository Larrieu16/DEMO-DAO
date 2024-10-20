package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import modelEntities.department;
import modelEntities.seller;

public interface sellerDao {
    public void insert(seller obj);
    public void update(seller obj);
    public void deleteById(Integer id);
    public seller findById(Integer id);
    List<seller> findAll();
    List<seller> findByDepartment(department department);

}
