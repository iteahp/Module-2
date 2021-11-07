public class bai2 {
    public static void main(String[] args) {
        int sum =0;

        for (int i = 10; i <50 ; i++) {
            if (isPrime(i)){
                sum+=i;
            }
        }
        System.out.println("sum of primes from 10 to 50 : " +sum);
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
