import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        double randomNumber = Math.random()*10 + 1;
        int randomNumberInt = (int) randomNumber;
        System.out.println(randomNumberInt);
        do {
            System.out.println("Enter the Number :");
            num = input.nextInt();
            if (num==randomNumberInt) {
                System.out.println("Congratulations");
                break;
            }
            if (num>randomNumberInt){
                System.out.println("Random number is greater than number entered");
            }
            else System.out.println(" Random number is smaller than number entered");

        }while (num!=randomNumberInt);





    }
}
