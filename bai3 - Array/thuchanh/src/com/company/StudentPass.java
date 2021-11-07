package com.company;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a size : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list :  ");
        for (int j= 0;j<arr.length;j++){
            System.out.print(arr[j] +"\t");
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
