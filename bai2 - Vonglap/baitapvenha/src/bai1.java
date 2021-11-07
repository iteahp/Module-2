public class bai1 {
    public static void main(String[] args) {
        int count =1;
        for (int i=11;count<=20;i++){
            if (divisible5(i)){
                if (count ==20) {
                    System.out.println("The number is divisible by 5 at the 20th position : " + i);
                }
                count++;
            }

        }

    }
    public static boolean divisible5(int num){
        boolean check =false;
        if (num % 5 == 0){
            check = true;
        }
        return check;
    }
}
