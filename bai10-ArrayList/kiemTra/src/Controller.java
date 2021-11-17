import java.util.Scanner;

public class Controller {
        static Scanner scanner = new Scanner(System.in);
        static NhanVien[] nhanViens = new NhanVien[0];

        public static NhanVien create(){
                System.out.println("Nhập tên ");
                String name = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập địa chỉ ");
                String address = scanner.nextLine();
                NhanVien nhanVien = new NhanVien(name,phoneNumber,address);
                return nhanVien;
        }
        public static void add(){
                NhanVien[] newNhanviens = new NhanVien[nhanViens.length+1];
                for (int i = 0; i < nhanViens.length; i++) {
                        newNhanviens[i] = nhanViens[i];
                }
                newNhanviens[newNhanviens.length-1] = create();
                nhanViens = newNhanviens;
        }
        public static void delete(){
                NhanVien[] newNhanviens = new NhanVien[nhanViens.length-1];
                System.out.println("Nhập id nhân viên cần xóa ");
                int id = Integer.parseInt(scanner.nextLine());
                int index = 0;
                for (int i = 0; i < nhanViens.length ; i++) {
                        if (nhanViens[i].getId()==id){
                                index =i;
                                break;
                        }
                }
                for (int i = 0; i < nhanViens.length; i++) {
                        if (i<index){
                                newNhanviens[i] =nhanViens[i];
                        }else if (i>index){
                                newNhanviens[i-1] = nhanViens[i];
                        }
                }
                nhanViens = newNhanviens;
        }
        public static void show(){
                for (int i = 0; i < nhanViens.length; i++) {
                        System.out.println(nhanViens[i].toString());
                }
        }
        public static void edit(){
                System.out.println("Nhập id nhân viên muốn sửa ");
                int id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < nhanViens.length; i++) {
                        if (nhanViens[i].getId() ==id){
                                nhanViens[i] = create();
                                nhanViens[i].setId(id);
                                break;
                        }
                }
        }
        public static void menu(){
                while (true) {
                        System.out.println("Quản lý nhân viên ");
                        System.out.println("1. Thêm nhân viên ");
                        System.out.println("2. Xóa nhân viên ");
                        System.out.println("3. Hiển thị nhân viên ");
                        System.out.println("4. Sửa nhân viên ");
                        System.out.println("5. Exit ");
                        System.out.println(" Lựa chọn : ");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                                case 1:
                                        add();
                                        break;
                                case 2:
                                        delete();
                                        break;
                                case 3:
                                        show();
                                        break;
                                case 4:
                                        edit();
                                        break;
                                case 5 :
                                        return;
                                default:
                                        System.out.println("Không có chức năng này vui lòng chọn lại ");
                        }
                }
        }
}
