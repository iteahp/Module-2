package com.company.view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ProductView productView = new ProductView();
    public Main() {
        System.out.println("MENU MANAGE STUDENT");
        System.out.println("1.Create Student\n" +
                "2.Show List Student\n"+
                "3.Delete Student By ID: "+
                "\n" +
                "4.Detail Student By ID:\n"+
                "5.Edit Student:");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                productView.formCreateProduct();
                break;
            case 2:
                productView.manageStudentList();
                break;
//            case 3:
//                studentView.deleteStudentById();
//            case 4:
//                studentView.detailStudentById();
//            case 5:
//                studentView.editStudent();
        }
    }
    public static void main(String[] args) {
        new Main();
        // write your code here
    }
}
