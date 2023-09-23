package org.example;

import org.example.business.ProductManager;
import org.example.dataAccess.HibernateProductDao;
import org.example.entities.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        Product product=new Product(1,"hello",300);
        ProductManager productManager=new ProductManager(new HibernateProductDao());
        productManager.add(product);

    }
}
