package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController =new ProductController();
    List<Product> products = productController.showProduct();

    public void creatProduct(){
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá : ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số lượng : ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả : ");
        String moTa = scanner.nextLine();
        Product product = new Product(name,price,quantity,moTa);
        productController.createProduct(product);
    }
   public void showProduct(){
       for (int i = 0; i < products.size(); i++) {
              if (i % 5==0 && i!=0){
                  scanner.nextLine();
              }
           System.out.println(products.get(i));
       }
    }


    public int findIndexById(){
        System.out.println("Nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
       return productController.findIndexById(id);
    }
    public void edit(){
       int index= findIndexById();
        if (index>=0){
            System.out.println("Nhập tên muốn sửa : ");
            productController.edit(index).setName(scanner.nextLine());
            System.out.println("Nhập giá muốn sửa : ");
            productController.edit(index).setPrice(Float.parseFloat(scanner.nextLine()));
            System.out.println("Nhập số lượng muốn sửa :");
            productController.edit(index).setQuantity(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập mô tả muốn sửa : ");
            productController.edit(index).setMoTa(scanner.nextLine());
            System.out.println("Đã sửa thành công ");
        }else System.out.println(" Không tìm thấy sản phẩm ");

    }
    public void delete(){
        int index = findIndexById();
        if (index >=0){
            System.out.println("Bạn có chắc chắn muốn xóa không . Nhập  ");
            productController.delete(index);
            System.out.println("Xóa thành công  : ");
        }else System.out.println(" Không tìm thấy sản phẩm ");
    }
    public void sort(){
        productController.sort();
        System.out.println("Đã sắp xếp theo giá thành công \n" +
                "1. hiện thị danh sách sản phẩm sau khi sắp xếp \n" +
                "2. quay về menu chính ");
        System.out.println("lựa chọn :");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1 :
                showProduct();
                break;
            case 2 :
                new Main();
                break;
        }
    }
    public void findProductMaxPrice(){
        System.out.println(" Sản phẩm có giá lớn cao nhất : ");
        System.out.println(productController.findProductPriceMax());

    }







}
