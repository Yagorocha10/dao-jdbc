package application;

import model.DaoFactory;
import model.SellerDao;
import model.entities.Department;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
    }
}