import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    public static KySu creatKysu(){

        scanner.nextLine();
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ  :");
        String address = scanner.nextLine();
        System.out.println("Nhập tuổi ");
        int age = scanner.nextInt();
        System.out.println("Nhập lương cơ bản ");
        int salary = scanner.nextInt();
        System.out.println("Nhập số ngày làm ");
        int workingDay = scanner.nextInt();
        System.out.println("Nhập hệ số lương ");
        double coefficientsSalary = scanner.nextDouble();
        scanner.nextLine();
        KySu kySu = new KySu(name,address,age,salary,workingDay,coefficientsSalary);
        return kySu;
    }
    public static CongNhan creatCongNhan(){
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ  :");
        String address = scanner.nextLine();
        System.out.println("Nhập tuổi ");
        int age = scanner.nextInt();
        System.out.println("Nhập lương cơ bản ");
        int salary = scanner.nextInt();
        System.out.println("Nhập số ngày làm ");
        int workingDay = scanner.nextInt();
        scanner.nextLine();
        CongNhan congNhan= new CongNhan(name,address,age,salary,workingDay);
        return congNhan;
    }
    public static NhanVien[] update(NhanVien[] nhanViens){
        NhanVien[] newNhanVien= new NhanVien[nhanViens.length+1];
        System.out.println("Thêm nhân viên ");
        System.out.println("1 . Kỹ sư ");
        System.out.println("2 . Công nhân ");
        System.out.println("Lựa chọn của bạn ");
        int number = scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1 :
                for (int i = 0; i < nhanViens.length; i++) {
                    newNhanVien[i] =nhanViens[i];
                }
                newNhanVien[newNhanVien.length -1] = creatKysu();
                break;
            case 2 :
                for (int i = 0; i < nhanViens.length; i++) {
                    newNhanVien[i] =nhanViens[i];
                }
                newNhanVien[newNhanVien.length -1] = creatCongNhan();
                break;
        }
        return newNhanVien;
    }
    public static  NhanVien[] delete(NhanVien[] nhanViens){
        NhanVien[] newNhanvien = new NhanVien[nhanViens.length-1];
        System.out.println("Nhập tên muốn tìm ");

        String name = scanner.nextLine();

        for (int i = 0; i < nhanViens.length; i++) {
            if (name.equals(nhanViens[i].getName())){
                for (int j = 0; j < newNhanvien.length; j++) {
                    if (j<i){
                        newNhanvien[j] = nhanViens[j];
                    }else if (j>i) {
                        newNhanvien[j - 1] = nhanViens[j];
                    }
                }
            }
        }
        return newNhanvien;
    }
    public static void show(NhanVien[] nhanViens){
        System.out.println("Hiển thị thông tin theo danh sách ");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư ");
        System.out.println(" lựa chọn tên ");
        int number = scanner.nextInt();
        switch (number){
            case 1 :
                for (int i = 0; i < nhanViens.length; i++) {
                    if (nhanViens[i] instanceof CongNhan){
                        System.out.println(nhanViens[i].toString());
                    }
                }
                break;
            case 2 :
                for (int i = 0; i < nhanViens.length; i++) {
                    if (nhanViens[i] instanceof KySu){
                        System.out.println(nhanViens[i].toString());
                    }
                }
                break;
        }
    }
    public static void search(NhanVien[] nhanViens){
        int count =0;
            System.out.println("Nhập tên muốn tìm kiếm thông tin ");
            scanner.nextLine();
            String name = scanner.nextLine();

            for (int i = 0; i < nhanViens.length; i++) {
                if (name.equals(nhanViens[i].getName())) {
                    System.out.println(nhanViens[i].toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Không tìm thấy tên");
                }
        }
        public static void edit(NhanVien[] nhanViens) {
            int count = 0;
            System.out.println("Nhập tên muốn sửa thông tin ");
            String name = scanner.nextLine();
            for (int i = 0; i < nhanViens.length; i++) {
                if (name.equals(nhanViens[i].getName())) {
                    System.out.println(nhanViens[i].toString());
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("Thông tin của  " + count + " nhân viên tên " + name);
                System.out.println("Nhập id nhân viên muốn sửa ");
                int id = scanner.nextInt();
                int index = 0;
                for (int i = 0; i < nhanViens.length; i++) {
                    if (nhanViens[i].getId() == id) {
                        index = i;
                    }
                }
                if (nhanViens[index] instanceof CongNhan) {
                    nhanViens[index] = creatCongNhan();
                } else nhanViens[index] = creatKysu();
                nhanViens[index].setId(id);
            }else System.out.println("Không tìm thấy tên nhân viên tên :  " +name);
        }
    }



