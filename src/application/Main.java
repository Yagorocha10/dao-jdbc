package application;

import model.DaoFactory;
import model.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE1: seller findById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}