package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập 3 cạnh tam giác ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.triangle(a,b,c);
    }

}
