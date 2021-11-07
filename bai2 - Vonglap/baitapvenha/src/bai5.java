import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2. nhập a,b,c từ bàn phím và trả về kết quả.");
        System.out.println(" Nhập a : ");
        double  a = input.nextDouble();
        System.out.println(" Nhập b : ");
        double  b = input.nextDouble();
        System.out.println(" Nhập c : ");
        double  c = input.nextDouble();
        double delta = b*b - 4*a*c;
        double x = -b/2*a;
        double x1 = (-b +Math.sqrt(delta))/ 2 * a;
        double x2 = (-b -Math.sqrt(delta))/ 2 * a;
        if (a!=0){
            if (delta !=0){
                if (delta>0){
                    System.out.println("Phương trình có 2 nghiệm : x1 = " +x1 +" và x2 = "+x2 );
                }else System.out.println("Phương trình vô nghiệm ");
            }else System.out.println("Phương trình có nghiệm duy nhất x = " +x);
        }else System.out.println("Phương trình là phương trình bậc 1");
    }
}
