package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        Product product=new Product(1,"hello",300);
        List<Logger> loggers=new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product);

    }
}
