package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD : ");
        double usd = scanner.nextDouble();
        System.out.printf("VND = " + usd*23000);
    }
}
