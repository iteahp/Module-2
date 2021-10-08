package com.company;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] arr = {"Như Anh","Ngọc Khánh","Đình Ánh","Lan Hương","Thế Bình","Lan Anh"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i<arr.length;i++){
            if (arr[i].equals(name)){
                System.out.println(" Position of the student in the list " + name + " is : " +i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println(" Not found " + name + "in the list .");
        }
    }
}
