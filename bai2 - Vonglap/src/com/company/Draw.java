package com.company;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw triangle square ");
        System.out.println("0. Exit");
        System.out.println("5. Draw the isosceles triangle");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        String res = "";
        switch (choice){
            case 1 :
                System.out.println("Draw the rectangle :");
                for (int i=0;i<3;i++){
                    res+= "* * * * * * \n";
                }
                System.out.println(res);
                break;
            case 2 :
                System.out.println("2. Draw the square triangle");
                for (int i = 5;i>0;i--){
                    for (int j = 1;j<i;j++){
                        res+=" ";
                    }
                    for (int j = 5; j >=i ; j--) {
                        res+="*";
                    }
                    res+="\n";
                }
                 System.out.println(res);
                break;
            case 3 :
                System.out.println("3. Draw the isosceles triangle");
                for (int i = 1;i<=5;i++){
                    for (int j=5;j>=i;j--){
                        res+="*";
                    }
                    res+="\n";
                    for (int j=0;j<i;j++){
                        res+=" ";
                    }
                }


                System.out.println(res);

                break;
            case 4 :
                System.exit(4);
            case 5 :
                System.out.println("Print isosceles triangle");
                for(int i = 1; i <= 6; i++) {
                    for(int j = 1; j <= 6-i; j++) {
                        System.out.print("  ");
                    }
                    for(int k = 1; k <= 2*i-1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }

    }
}
