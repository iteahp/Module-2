package com.company;

import java.util.Scanner;

public class AddElement {
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
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Enter a Index : ");
        int index = input.nextInt();
        int[] arrNew = new int[size +1];
        for (int i = 0;i<index-1;i++){
            arrNew[i]=arr[i];
        }
        arrNew[index-1] = num;
        for (int i= index-1;i<arr.length;i++){
            arrNew[i +1] = arr[i];
        }
        System.out.println(" New property list :");
        for (int i =0;i<arrNew.length;i++){
            System.out.print(arrNew[i] + "\t");
        }
    }
}
