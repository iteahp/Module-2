package com.company;

import java.util.Scanner;

public class SumDiagonals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        for (int i=0;i<size;i++){
            for (int j = 0;j<size;j++){
                System.out.println("Enter element :");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Property list : ");
        for (int i=0;i<size;i++){
            for (int j = 0;j<size;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Sum Diagonals = "+ totalDiagonals(size,arr));

    }
    public static int totalDiagonals(int n,int[][] arr){
        int sum =0;
        int sum2=0;
        for (int i =0;i<n;i++){
            sum+=arr[i][i];
        }
        for (int i=n-1;i>=0;i--){
            sum2+=arr[i][i];
        }
        return sum+sum2;
    }
}
