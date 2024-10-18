package model.dao;

import modelEntities.department;

import java.util.List;

public class departmentDao {
    void insert(department obj);
    void update(department obj);
    void deleteById(Integer id);
    department findById(Integer id);
    List<department> findAll();

}
