package com.company.controller;

import com.company.model.Product;
import com.company.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();
    public List<Product> showListProduct(){
      return productService.findAll();
    }
    public void createProduct(Product product){
        productService.save(product);
    }
}
