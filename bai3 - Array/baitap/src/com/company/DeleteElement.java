package com.company;

import java.util.Scanner;

public class DeleteElement {
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
       int index = 0;
       for (int i =0;i<arr.length;i++){
           if (arr[i]== num){
               index =i;
               System.out.println("Number in Array");
               break;
           }
       }
       for (int i = index;i<arr.length-1;i++){
           arr[i]=arr[i+1];
       }
       arr[arr.length-1] = 0;
        System.out.println("New Property List :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
