package sevice;

import model.Product;

import java.util.List;

public interface IProductManager {
   List<Product> findAll();
   void save(Product product);
   int findIndexById(int id);
   Product edit(int index);
   Product delete(int index);
   void sort();
   Product findProductMaxPrice();
   void readFile();
   void writeFile();


}
