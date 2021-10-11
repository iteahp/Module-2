package com.company;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of the array : ");
        int rows =input.nextInt();
        System.out.println("Enter the number of columns of the array : ");
        int columns =input.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i =0;i<rows;i++){
            System.out.println("Enter elements for row " +(i+1));
            for (int j=0;j<columns;j++){
                System.out.println("Enter element " +(j+1));
                arr[i][j] =input.nextInt();
            }
        }
        System.out.println("Enter the number of columns to sum : ");
        int index = input.nextInt();
        int sum = 0;
        for (int i =0;i<columns;i++){
           sum +=  arr[i][index] ;
        }
        System.out.println("Total of column : "+sum);
    }
}
