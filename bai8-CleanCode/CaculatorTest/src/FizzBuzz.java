public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number){
        boolean isFizz= number % 3 == 0 ;
        boolean isBuzz= number % 5 == 0;
        if(isBuzz && isFizz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
