package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] zeroToNine = {" zero ", " one ", " two ", " three ", " four ", " five ", " six ", " seven ", " eight ", " nine "};
        String[] tenToNineteen = {" ten ", " eleven ", " twelve ", " thirteen ", " fourteen ", " fifteen ", " sixteen ", " seventeen ", "eighteen", "nineteen"};
        String[] twentyToNinety = {"", "", " twenty ", " thirty ", " forty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninety "};
        String res = "";
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 10 && num>=0) {
            res +=""+ zeroToNine[num];
        } else if (num < 20) {
            res +=""+ tenToNineteen[num % 10];
        } else if (num < 100) {
            if (num % 10 == 0) {
                res +=""+ twentyToNinety[num / 10];
            } else res +=""+ twentyToNinety[num / 10] + zeroToNine[num % 10];
        } else if (num < 1000) {
            if (num % 100 == 0) {
                res +=""+ zeroToNine[num / 100] + "hundred ";
            }else res+=""+ zeroToNine[num/100]+" hundred " + " and " + twentyToNinety[(num%100)/10]+zeroToNine[(num%100)%10];
        }else res+= "out 1000";

        System.out.println(res);
    }


}
