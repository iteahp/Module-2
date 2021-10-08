package com.company;

import java.util.Scanner;

public class FindMax {
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
        int max = arr[0];
        int index = 1;
        for (int j= 0;j<arr.length;j++){
            if (arr[j]>max){
                max = arr[j];
                index = j+1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);

    }
}
