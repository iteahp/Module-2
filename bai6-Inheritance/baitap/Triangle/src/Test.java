import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        System.out.println(" Enter Color : ");

        String color = scanner.nextLine();

        Triangle triangle = new Triangle(a,b,c,color);
        System.out.println(triangle);

    }
}
