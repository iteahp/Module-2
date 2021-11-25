package controller;

import model.Product;
import sevice.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

  public List<Product> showProduct(){
       return productService.findAll();
   }
  public void createProduct(Product product){
            productService.save(product);
   }
   public int findIndexById(int id){
      return productService.findIndexById(id);
   }
   public Product edit(int index){
      return productService.edit(index);
   }
   public Product delete(int index){
      return productService.delete(index);
   }
   public void sort(){
      productService.sort();
   }
   public Product findProductPriceMax(){
      return productService.findProductMaxPrice();
   }
}
