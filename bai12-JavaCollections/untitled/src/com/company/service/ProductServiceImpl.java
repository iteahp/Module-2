package com.company.service;

import com.company.model.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    public static List<Product> productList = new LinkedList<>();
    static {
        productList.add(new Product(1, "NOKIA",1.5f ));
        productList.add(new Product(2, "IPHONE",2.5f ));
        productList.add(new Product(3, "BPHONE",3.5f ));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }
}
