package view;

import model.Revenue;
import sevice.RevenueService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class RevenueView {
    Scanner scanner = new Scanner(System.in);
    RevenueService revenueService = new RevenueService();
   public void showAll(){
       double sum =0;
       for (Revenue revenue: revenueService.findAll()) {
           System.out.println(revenue);
           sum += revenue.getTurnover();
       }
       System.out.println("Tổng doanh thu = " +sum);
   }

   public void menuRevenue(){
       int choice =-1;
       do {
           System.out.println("Menu Doanh thu");
           System.out.println("1. Hiển thị bảng doanh thu từ trước tới nay");
           System.out.println("2. Hiển thị bảng doanh thu theo ngày tháng năm nhập vào ");
           System.out.println("0. Trở lại ");
           choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1: {
                    showAll();
                    break;
               }
           }
       }while (choice!=0);
   }
}
