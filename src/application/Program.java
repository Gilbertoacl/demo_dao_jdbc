package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Paulo", "paulo@paulo", new Date(), 2000.00, obj);
        System.out.println(seller);
        System.out.println(obj);
    }
}
