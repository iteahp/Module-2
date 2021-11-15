import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new CongNhan("Nam","Hải Phòng",20,300,20);
        nhanViens[1] = new KySu(1.5,"Duyên","Hà Nội",23,500,25);
        nhanViens[2] = new KySu(2.5,"Hải","Hà Nam",30,600,20);
        while (true) {
            System.out.println("Quản lý nhân viên ");
            System.out.println("1.Thêm nhân viên ");
            System.out.println("2.Tìm kiếm theo tên ");
            System.out.println("3.Xóa theo tên ");
            System.out.println("4.Sửa theo tên ");
            System.out.println("5.Hiển thị thông tin ");
            System.out.println("6.Sắp xếp nhân viên theo tên ");
            System.out.println("7.Exit ");
            System.out.println(" Lựa chọn của bạn ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    nhanViens =Controller.update(nhanViens);
                    break;
                case 2 :
                    Controller.search(nhanViens);
                    break;
                case 3 :
                    nhanViens = Controller.delete(nhanViens);
                    break;
                case 4 :
                     Controller.edit(nhanViens);
                    break;
                case 5 :
                    Controller.show(nhanViens);
                    break;
                case 6 :
                case 7 :

            }
        }
    }
}
