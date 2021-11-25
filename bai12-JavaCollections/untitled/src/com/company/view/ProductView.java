package com.company.view;

import com.company.controller.ProductController;
import com.company.model.Product;

import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();
    public void formCreateProduct(){
        boolean checkCreate = true;
        while (checkCreate){
//            System.out.println("Nhập vào số thứ tự của học viên: ");
//            int id = scanner.nextInt();
            int id = productController.showListProduct().size()+1;
            System.out.println("id - "+id);
            System.out.println("Nhập vào tên của product: ");
            String name = scanner.next();
            System.out.println("Nhập vào giá của product: ");
            float price = scanner.nextFloat();
            Product product = new Product(id, name, price);
            productController.createProduct(product);
            System.out.println("Nhập một phím bất kì để tạo dữ liệu tiếp - Nhập QUIT để thoát khỏi chương trình");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void manageStudentList(){
        System.out.println("STT---NAME---PRICE");
        System.out.println("Size == "+productController.showListProduct().size());
        for(int i=0; i<productController.showListProduct().size();i++){
            System.out.println(" "+productController.showListProduct().get(i).getId()
                    +"   "+productController.showListProduct().get(i).getName()+"   "+productController.showListProduct().get(i).getPrice()
                   );

        }
        System.out.println("Nhập vào Quit để quay lại Menu");
        String enterOrQuit = scanner.next();
        if(enterOrQuit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
