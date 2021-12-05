package baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements IProductManager {
    private static List<Product> products = new ArrayList<>();
     static final String FILE_PATH = "product.txt";
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void show() {
        for (Product product : products
             ) {
            System.out.println(product);
        }
    }

    @Override
    public Product search(int index) {
       if (index>=0){
           return products.get(index);
       }
       return null;
    }

    @Override
    public int findIndexByCode(String code) {
        for (int i = 0; i < products.size(); i++) {
            if (code.equals(products.get(i).getCode())){
                return i;
            }
        }
        return -1 ;
    }

    @Override
    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void writeFile() {
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            ois.writeObject(products);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
