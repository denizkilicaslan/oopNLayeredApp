package org.example.business;

import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

public class ProductManager {

    //iş kuralları
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 0) {
            throw new Exception(" ");
        }

        productDao.add(product);
    }
}
