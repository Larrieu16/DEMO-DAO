import model.dao.daoFactory;
import model.dao.departmentDao;
import modelEntities.department;

import java.util.List;
import java.util.Scanner;


public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        departmentDao departmentDao = daoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: findById =======");
        department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<department> list = departmentDao.findAll();
        for (department d : list) {
            System.out.println(d);
        }
        System.out.println("\n=== TEST 3: insert =======");
        department newDepartment = new department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());
        System.out.println("\n=== TEST 4: update =======");
        department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
    }
}

