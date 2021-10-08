package com.company;

public class PrimeLessThan100 {
    public static boolean isPrime1(int number) {
        boolean check = true;
        if (number<2){
            check = false;
        }else if (number == 2){
            check = true;
        }else if (number%2==0){
            check = false;
        }
        else {
            for (int i = 3;i<=Math.sqrt(number);i+=2){
                if (number % i==0){
                    check = false;
                    break;
                }
            }

        }
        return  check;

    }

    public static void main(String[] args) {
        for (int num =1;num<100;num++){
            if (isPrime1(num)){
                System.out.print(num+ ",");
            }
        }

    }
}
