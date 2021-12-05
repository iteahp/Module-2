package baitap;

import java.util.List;

public interface IProductManager {
    List<Product> findAll();
    void save(Product product);
    void show();
    Product search(int index);
    int findIndexByCode(String code);
    void readFile();
    void writeFile();
}
