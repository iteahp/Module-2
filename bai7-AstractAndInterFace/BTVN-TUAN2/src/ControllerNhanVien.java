import java.util.Scanner;

public class ControllerNhanVien {
    static NhanVien[] listNV = new NhanVien[0];
    static Scanner scanner = new Scanner(System.in);

    public static NhanVien createNhanVien(boolean isKySu) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double workingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isKySu) {
            CongNhan congNhan = new CongNhan(id, name, age, address, workingDay, salary);
            return congNhan;
        } else {
            System.out.println("Nhập payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            KySu kySu = new KySu(id, name, age, address, workingDay, salary, payRateSalary);
            return kySu;
        }
    }

    public static void addNhanVien(NhanVien nhanVien) {
        NhanVien[] newArrNV = new NhanVien[listNV.length + 1];
        for (int i = 0; i < listNV.length; i++) {
            newArrNV[i] = listNV[i];
        }
        newArrNV[listNV.length] = nhanVien;

        listNV = newArrNV;
    }

    public static void showNhanVien() {
        System.out.println("Hiển thị thông tin theo danh sách ");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư ");
        System.out.println(" lựa chọn  ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number){
            case 1 :
                for (int i = 0; i < listNV.length; i++) {
                    if (listNV[i] instanceof CongNhan){
                        System.out.println(listNV[i].toString());
                    }
                }
                break;
            case 2 :
                for (int i = 0; i < listNV.length; i++) {
                    if (listNV[i] instanceof KySu){
                        System.out.println(listNV[i].toString());
                    }
                }
                break;
        }
    }
    public static void search(){
        int count =0;
        System.out.println("Nhập tên muốn tìm kiếm thông tin ");
        String name = scanner.nextLine();

        for (int i = 0; i < listNV.length; i++) {
            if (name.equals(listNV[i].getName())) {
                System.out.println(listNV[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println(" Không tìm thấy tên trong danh sách");
        }else {
            System.out.println(" Thông tin của "+count+ " nhân viên tên " +name );
        }
    }
    public static  void delete(){
        NhanVien[] newNhanvien = new NhanVien[listNV.length-1];
        System.out.println("Nhập tên muốn xóa ");
        String name = scanner.nextLine();
        int length = listNV.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (name.equals(listNV[i].getName())){
                count++;
                for (int j = 0; j < newNhanvien.length; j++) {
                    if (j<i){
                        newNhanvien[j] = listNV[j];
                    }else if (j>i) {
                        newNhanvien[j - 1] = listNV[j];
                    }
                }
                length--;
            }
            if (count==0){
                System.out.println("Không thấy tên trong danh sách");
            }else System.out.println("Đã xóa " +count+" nhân viên tên "+name);
        }

        listNV =newNhanvien;
    }



}
