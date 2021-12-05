package view;

import javafx.scene.shape.Path;

import java.util.Scanner;

public class Main {
   static   Scanner scanner = new Scanner(System.in);
   static ProductView productView = new ProductView();
   public  Main(){
       while (true){
           System.out.println(" Quản lý sản phẩm ");
           System.out.println("1.Xem danh sách ");
           System.out.println("2.Thêm sản phẩm ");
           System.out.println("3.Cập nhật sản phẩm ");
           System.out.println("4.Xóa sản phẩm  ");
           System.out.println("5.Sắp xếp  ");
           System.out.println("6.Tìm sản phẩm có giá đắt nhất");
           System.out.println("7.Exit ");
           System.out.println("Lựa chọn");
           int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productView.showProduct();
                    break;
                case 2 :
                    productView.creatProduct();
                    break;
                case 3 :
                    productView.edit();
                    break;
                case 4:
                    productView.delete();
                    break;
                case 5:
                    productView.sort();
                    break;
                case 6:
                    productView.findProductMaxPrice();
                    break;
                case 7 :
                    return;
                default:
                    System.out.println("Nhập sai rồi mời nhập lại ");
                    break;
            }
       }

   }

    public static void main(String[] args) {

            new Main();
    }
}
