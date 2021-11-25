import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
  static   LinkedList<Product> productsList = new LinkedList<>();

   public Product create(){
       System.out.println("Nhập tên : ");
       String name = scanner.nextLine();
       System.out.println("Nhập giá :");
       int price = Integer.parseInt(scanner.nextLine());
       Product product = new Product(name,price);
       return product;
   }
   public void add(){
       productsList.add(create());
   }
   public void edit(){
       Product product = findIndexById();
       System.out.println("Nhập tên ");
       product.setName(scanner.nextLine());
       System.out.println("Nhập giá ");
       product.setPrice(Integer.parseInt(scanner.nextLine()));
   }
   public Product findIndexById(){
       System.out.println("Nhập id sản phẩm ");
       int id = Integer.parseInt(scanner.nextLine());
       return productsList.get(id);
   }

}
