package minitest.view;

import minitest.cotroller.HumanController;
import minitest.model.Human;
import minitest.model.Student;
import minitest.model.Teacher;

import java.util.Scanner;

public class HumanView {
    public Scanner scanner = new Scanner(System.in);
    HumanController humanController = new HumanController();

    public void show() {
        for (Human human : humanController.show()
        ) {
            System.out.println(human.toString());
        }

    }

    public void add() {
        int choice = -1;
        do {
            System.out.println("1.Thêm học sinh :");
            System.out.println("2.Thêm giáo viên :");
            System.out.println("0.Trở lại menu :");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Nhập tên :");
                    String name = scanner.nextLine();
                    int age = validateInt("Nhập tuổi : ");
                    float avg = validateAvgAndSalary("Nhập điểm trung bình ");
                    Student student = new Student(name, age, avg);
                    humanController.add(student);
                    break;
                }
                case 2: {
                    System.out.println("Nhập tên :");
                    String name = scanner.nextLine();
                    int age = validateInt("Nhập tuổi : ");
                    float salary = validateAvgAndSalary("Nhập lương  :");
                    Teacher teacher = new Teacher(name,age,salary);
                    humanController.add(teacher);
                    break;
                }
            }

        }while (choice!=0);

    }

    public int findIndexByName() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        return humanController.findIndexByName(name);
    }

    public void delete() {
        int index = findIndexByName();
        if (index >= 0) {
            humanController.delete(index);
            System.out.println("Đã xóa thành công");
        } else System.out.println("Tên không có trong danh sách");
        System.out.println("Bạn có muốn xóa tiếp không __ Hãy ấn một phím bất kỳ để tiếp tục nếu không hãy ấn 'q' để trở về menu ");
        String out  =scanner.nextLine();
        if (out.equals("q")){
            new Main();
        }else delete();
    }

    public void edit() {
        int index = findIndexByName();
        if (index >= 0) {
            System.out.println(" Nhập tên mới ");
            humanController.edit(index).setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới ");
            int age = Integer.parseInt(scanner.nextLine());
            humanController.edit(index).setAge(age);
            if (humanController.edit(index) instanceof Student) {
                float avg = validateAvgAndSalary("Nhập điểm trung bình mới ");
                ((Student) humanController.edit(index)).setAvg(avg);
            } else if (humanController.edit(index) instanceof Teacher) {
                float salary = validateAvgAndSalary(" Nhập lương mới : ");
                ((Teacher) humanController.edit(index)).setSalary(salary);
            } else System.out.println("Tên không có trong danh sách");
        }
        System.out.println("Bạn có muốn sửa tiếp không __ Hãy ấn một phím bất kỳ để tiếp tục nếu không hãy ấn 'q' để trở về menu ");
        String out  =scanner.nextLine();
        if (out.equals("q")){
            new Main();
        }else edit();
    }
    public float validateAvgAndSalary(String str){
        float avgAndSalary = 0.0f;
        try {
            System.out.println(str);
            avgAndSalary = Float.parseFloat(scanner.nextLine());
            if (avgAndSalary>0){
                return avgAndSalary;
            }
            throw new ArithmeticException("Không được nhập số nhỏ hơn 0 ");

        }catch (NumberFormatException e){
            System.out.println("Không được nhập chuỗi ");
            validateAvgAndSalary(str);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            validateAvgAndSalary(str);
        }
       return avgAndSalary;
    }
    public int validateInt(String str){
        int age = 0;
        try {
            System.out.println(str);
            age = Integer.parseInt(scanner.nextLine());
            if (age>0){
                return age;
            }
            throw new ArithmeticException(" Không được nhập số nhỏ hơn 0 ");

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            validateInt(str);
        }catch (NumberFormatException e){
            System.out.println("Không được nhập chuỗi");
            validateInt(str);
        }
        return age;
    }


}
