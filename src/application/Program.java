package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = new DaoFactory().createSellerDao();
        System.out.println("==========TESTE 1 ; SellerDao.findById()============");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==========TESTE 2 ; SellerDao.findByDepartment()============");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==========TESTE 3 ; SellerDao.findAll()============");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==========TESTE 4 ; SellerDao.insert()============");
        Seller newSeller = new Seller(null, "Greg", "g@g.com", new Date(), 4000.00, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = "+ newSeller.getId());

        System.out.println("\n==========TESTE 5 ; SellerDao.update()============");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Updated!");
    }
}
