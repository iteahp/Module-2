import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chào bạn đến với GAME AI LÀ TRIỆU PHÚ.");
        System.out.println("LỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ.");
        System.out.println("1. 1 Bạn");
        System.out.println("2. 2 Bạn");
        System.out.println("3. 3 Bạn");
        System.out.println("4. 4 Bạn");
        System.out.println("Lựa chọn của bạn là : ");
        int num = input.nextInt();
        switch (num){
            case 1 :
            case 2 :
            case 4 :
                System.out.println(" Bạn đã sai mất rồi ");
                break;
            case 3 :
                System.out.println(" Chính xác rồi đó ");
                break;
            default:
                System.out.println(" Bạn chỉ được lựa chọn 1 trong 4 đáp án thôi ");
        }
    }
}
