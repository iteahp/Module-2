import java.util.Scanner;

public class Controller {
    public static void display(NhanVien[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void enter(NhanVien[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = addNhanVien();
        }
    }
    public static NhanVien[] add(NhanVien[] arr  ){


        int length = arr.length;
        NhanVien[] newArr = new NhanVien[length+1];

        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        newArr[length] = addNhanVien();
        return newArr;
    }
    public static NhanVien[] delete(NhanVien[] arr){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập id nhân viên muốn xóa : ");
        int id = scanner.nextInt();
        NhanVien[] newArr= new NhanVien[arr.length-1];
        for (int j = 0; j < arr.length; j++) {
            if (j<id){
                newArr[j] =arr[j];
            }else if (j>id){
                newArr[j]=arr[j+1];
            }
        }
        return newArr;

    }
    public static NhanVien addNhanVien(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính ");
        String gender = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(name,age,gender);
        return nhanVien;
    }
    public static NhanVien[] edit(NhanVien[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id nhân viên muốn sửa");
        int id = scanner.nextInt();
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (id == arr[i].getId()){
                index=i;
                break;
            }
        }
        arr[index]=addNhanVien();
        return arr;
    }

}
