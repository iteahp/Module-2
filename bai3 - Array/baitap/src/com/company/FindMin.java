package com.company;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<arr.length;i++){
            System.out.println("Enter element " +(i+1)+" of Array : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Property List :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for (int i=0;i<arr.length;i++){

        }
    }
}
