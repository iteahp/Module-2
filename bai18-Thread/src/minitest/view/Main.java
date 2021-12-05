package minitest.view;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    HumanView humanView = new HumanView();

    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        int choice = -1;
        do {
            System.out.println("Quản lý ");
            System.out.println("1 .Đọc từ file và lưu vào danh sách  ");
            System.out.println("2 .Thêm người vào danh sách  ");
            System.out.println("3 .Sửa người trong danh sách  ");
            System.out.println("4 .Xóa người trong  danh sách  ");
            System.out.println("5 .Lưu danh sách sau khi thay đổi   ");
            System.out.println("0 .Thoát    ");
            System.out.println("lựa chọn ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Danh sách người dùng ");
                    humanView.show();
                    break;
                }
                case 2: {
                    humanView.add();
                    break;
                }
                case 3: {
                    humanView.edit();
                    break;
                }
                case 4: {
                    humanView.delete();
                    break;
                }
                case 5: {
                    System.out.println("Đã ghi file thành công : ");
                    break;
                }
                case 0 :
                    System.out.println(" Xin cảm ơn và chào tạm biệt  ");
                    break;
            }
        } while (choice != 0);

    }
}
