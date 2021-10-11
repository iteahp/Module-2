package com.company;

import java.util.Scanner;

public class CountStringCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine();
        System.out.println("Enter a Character ");
        char character = input.next().charAt(0);
        int count =0;
        for (int i =0;i<str.length();i++){
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println(character + " appears at '" + str + "' " + count + " times");
        }

    }

//    public static Character[] toCharacterArray(String s){
//        if (s==null){
//            return null;
//        }
//        int length = s.length();
//        Character[] arr = new Character[length];
//        for (int i = 0;i<length;i++){
//            arr[i] = s.charAt(i);
//        }
//        return  arr;
//    }
//}
