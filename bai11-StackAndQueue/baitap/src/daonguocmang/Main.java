package daonguocmang;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }
    public static int[] daoNguocMangInterger(int[] array ){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        return array;
    }
    public static String daoNguocString(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i <str.length() ; i++) {
            str+=stack.pop();
        }
        return str;
    }
}
