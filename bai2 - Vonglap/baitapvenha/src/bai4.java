import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double randomNumber = Math.random()*9 + 1;
        int randomNumberInt = (int) randomNumber;
        System.out.println(randomNumberInt);
        do {
            System.out.println("Enter the Number :");
            int num = input.nextInt();
            if (num==randomNumberInt) {
                System.out.println("Congratulations");
                break;
            }
            if (num>randomNumberInt){
                System.out.println("Random number is greater than number entered");
            }
            else System.out.println(" Random number is smaller than number entered");

        }while (true);





    }
}
