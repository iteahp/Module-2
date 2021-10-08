package com.company;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of Array 1 : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<arr.length;i++){
            System.out.println("Enter element " +(i+1)+" of Array 1 : ");
            arr[i] = input.nextInt();
        } System.out.println("Enter a size of Array 2 : ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (int i =0;i<arr2.length;i++){
            System.out.println("Enter element " +(i+1)+" of Array 2 : ");
            arr2[i] = input.nextInt();
        }

        System.out.println("Property List 1 :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nProperty List 2:");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }
        int[] arr3 = new int[size +size2];
        for (int i =0;i<size;i++){
            arr3[i]=arr[i];
        }
        for (int i = size;i<size+size2;i++){
            arr3[i]=arr2[i-size];
        }
        System.out.println("\nProperty List 3 :");
        for (int i=0;i< arr3.length;i++){
            System.out.print(arr3[i] +"\t");
        }
    }
}
