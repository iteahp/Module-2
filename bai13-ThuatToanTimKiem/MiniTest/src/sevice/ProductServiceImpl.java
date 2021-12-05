package sevice;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements IProductManager{
    public static List<Product> products = new ArrayList<Product>() ;
    public final static String FILE_PATH = "productList.txt";
    static {
        products.add(new Product("Nokia",5.6f,3,"hang chat luong na co"));
        products.add(new Product("Iphone",8.6f,9,"tuyet voi luon"));
        products.add(new Product("Bphone",7.6f,6,"nhu  co"));
        products.add(new Product("Nokia",4.6f,37,"ha"));
        products.add(new Product("Samsung",2.6f,12,"nhu ao co"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
            products.add(product);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public Product edit(int index){
        return products.get(index);
    }

    @Override
    public Product delete(int index) {
        return products.remove(index);
    }

    @Override
    public void sort() {
        Collections.sort(products,new ProductSortByPrice());
    }

    @Override
    public Product findProductMaxPrice() {
        List<Product> SortedProducts = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            SortedProducts.add(products.get(i));
        }
        Collections.sort(SortedProducts,new ProductSortByPrice());
        return SortedProducts.get(SortedProducts.size()-1);
    }

    @Override
    public void readFile() {
        File file = new File(FILE_PATH);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine())!=null){
                String[] str  = line.split(",");
                int id = Integer.parseInt(str[0]);
                String name = str[1];
                float price  = Float.parseFloat(str[2]);
                int quantity = Integer.parseInt(str[3]);
                String moTa = str[4];
                Product product = new Product(id,name,price,quantity,moTa);
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile() {

    }
}
