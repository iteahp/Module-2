package ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] +"\t");
        }
            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
            int x = scaner.nextInt();
            try {
                System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Chỉ số vượt quá giới hạn của mảng");
            }

    }
}
