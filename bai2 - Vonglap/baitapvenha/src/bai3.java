import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = input.nextInt();
        if (isPrime(num)){
            System.out.println( num+" is Prime ");
        }else System.out.println(num +" is not Prime");
    }
    public static boolean isPrime(int num){
        boolean check = true;
        if (num<2){
            check = false;
        }
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
}
