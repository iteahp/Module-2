package com.company;

public class PrimeFirst {
    public static boolean isPrime(int number) {
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

        int count = 1;
            for (int number=13;count<=20;number++){
                if (isPrime(number)){
                    if (count ==20){
                        System.out.print(number);
                    }
                    count++;
                }
            }

    }




}
