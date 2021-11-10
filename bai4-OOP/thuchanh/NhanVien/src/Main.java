import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien[] nhanVien= new NhanVien[3];
        Controller.enter(nhanVien);
        while (true) {
            System.out.println("1. Hiển thị nhân viên ");
            System.out.println("2. Thêm nhân viên ");
            System.out.println("3. Xóa nhân viên ");
            System.out.println("4. Sửa nhân viên ");
            System.out.println(" Lựa chọn của bạn  :");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Controller.display(nhanVien);
                    break;
                case 2:
                    nhanVien = Controller.add(nhanVien);
                    break;
                case 3:
                    nhanVien = Controller.delete(nhanVien);
                    break;
                case 4:
                    nhanVien=Controller.edit(nhanVien);
            }
        }


    }


}
