package minitest.controller.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    static Scanner scanner = new Scanner(System.in);
    public static final String STUDENT_NAME_REGEX = "^[a-zA-Z0-9 ]+$";
    public static final String STUDENT_CODE_REGEX = "^[a-zA-Z0-9 ]+$";
    public static final String ADDRESS_REGEX = "^[a-zA-Z0-9 ]+$";
    public static final String GENDER_REGEX = "^[a-zA-Z ]+$";
    public static final String CHOICE_REGEX = "^[0-9]+$";
    public static final String AGE_REGEX = "^[0-9]+$";
    public static final String SCORE_REGEX = "^[0-9]+$";


    public static boolean validateString(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static String validation(String soutInput,String regex){
        String output= null;
        while (true){
            System.out.println(soutInput);
            String input = scanner.nextLine();
            if (Validation.validateString(input,regex)){
                output = input;
                break;
            }else System.err.println("Không đúng định dạng");
        }
        return output;
    }
}
