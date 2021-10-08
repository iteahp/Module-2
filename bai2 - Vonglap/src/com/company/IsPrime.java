package com.company;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to number : ");
        int number = scanner.nextInt();
        String res = "";
        if (number<2){
            res+=number+ " is not Prime";
        }else {
            boolean check = true;
            int i =2;
            for (;i<=Math.sqrt(number);i++){
                if (number % i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                res+= number+" is Prime";
            }else res+= number + " is not Prime";
        }
        System.out.println(res);
    }

}
