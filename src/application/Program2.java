package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
        System.out.println("==========TESTE 1 ; DepartmentDao.findById()============");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n==========TESTE 2 ; DepartmentDao.findAll()============");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==========TESTE 3 ; DepartmentDao.insert()============");
        Department newDepartment = new Department(null, "Marketing");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = "+ newDepartment.getId());

        System.out.println("\n==========TESTE 4 ; DepartmentDao.update()============");
        dep = departmentDao.findById(1);
        dep.setName("Cleaning");
        departmentDao.update(dep);

        System.out.println("\n==========TESTE 5 ; DepartmentDao.delete()============");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        sc.close();
    }
}
