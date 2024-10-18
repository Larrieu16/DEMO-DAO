package model.dao;

import java.util.List;
import modelEntities.seller;

public class sellerDao {
    void insert(seller obj);
    void update(seller obj);
    void deleteById(Integer id);
    seller findById(Integer id);
    List<seller> findAll();
}
