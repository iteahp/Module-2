package minitest.controller.view;

import minitest.controller.model.Students;
import minitest.controller.service.StudentService;
import minitest.controller.validation.Validation;

import java.util.Scanner;

public class StudentView {
    StudentService studentService = new StudentService();
    Scanner scanner =new Scanner(System.in);
    public Students create(){

        String studentCode = Validation.validation("Nhập mã sinh viên",Validation.STUDENT_CODE_REGEX);
        String studentName = Validation.validation("Nhập tên sinh viên",Validation.STUDENT_NAME_REGEX);
       int age = Integer.parseInt(Validation.validation("Nhập tuổi",Validation.AGE_REGEX));
       String address = Validation.validation("Nhập địa chỉ",Validation.ADDRESS_REGEX);
       String gender = Validation.validation("Nhập giới tính",Validation.GENDER_REGEX);
       double score = Double.parseDouble(Validation.validation("Nhập điểm trung bình",Validation.SCORE_REGEX));
        Students student = new Students(studentCode,studentName,age,gender,address,score);
        return student;
    }
    public void add(){
        studentService.save(create());
    }
    public void delete(){
        while (true){
            int index = findIndexByStudenCode();
            if (index>=0){
                System.out.println("Nhập 'Y' để tiến hành xóa hoặc nhấn phím bất kỳ để trở lại menu");
                String out = scanner.nextLine();
                if (out.equalsIgnoreCase("Y")){
                    studentService.delete(index);
                }else {
                    return;
                }
                System.out.println("Xóa sinh viên thành công");
            }else {
                System.err.println("Không tìm thấy sinh viên theo mã nhập vào");
            }
            System.out.println(" Nhấn Enter để thoát hoặc 1 phím bất kỳ để tiếp tục");
            String out = scanner.nextLine();
            if (out.equals("")){
                break;
            }
        }

    }
    public void edit(){
        int index = findIndexByStudenCode();
        if (index>=0){
            studentService.edit(index,create());
        }else System.err.println("Không tìm thấy nhân viên theo mã nhập vào");

    }
    public void show(){
        for (int i = 0; i < studentService.findAll().size(); i++) {
            if (i%5==0 && i!=0){
                scanner.nextLine();
            }
            System.out.println(studentService.findAll().get(i));
        }
    }
    public int findIndexByStudenCode(){
        System.out.println("Nhập mã sinh viên ");
        String studentCode = Validation.validation("Nhập mã sinh viên",Validation.STUDENT_CODE_REGEX);
        return studentService.findIndexByStudentCode(studentCode);
    }

    public void menuStudent(){
        System.out.println("                                         🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸");
        System.out.println("                                         🌸                    ***  QUẢN LÝ SINH VIÊN  ***                    🌸");
        System.out.println("                                         🌸         1. HIỂN THỊ DANH SÁCH SINH VIÊN                             🌸");
        System.out.println("                                         🌸         2. THÊM 1 SINH VIÊN VÀO DANH SÁCH                       🌸");
        System.out.println("                                         🌸         3. SỬA ĐỔI THÔNG TIN SINH VIÊN                          🌸");
        System.out.println("                                         🌸         4. XÓA 1 SINH VIÊN KHỎI DANH SÁCH                           🌸");
        System.out.println("                                         🌸         5. SẮP XẾP                                            🌸");
        System.out.println("                                         🌸         6. ĐỌC TỪ FILE                                            🌸");
        System.out.println("                                         🌸         7. GHI VÀO FILE                                          🌸");
        System.out.println("                                         🌸         0. THOÁT                                          🌸");
        System.out.println("                                         🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸");
    }
    public void menuSort(){
        int choice = -1;
        do {
            System.out.println("                                         🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸");
            System.out.println("                                         🌸                    ***  SẮP XẾP SINH VIÊN THEO ĐIỂM TRUNG BÌNH  ***                    🌸");
            System.out.println("                                         🌸         1. SẮP XẾP ĐIỂM TRUNG BÌNH TĂNG DẦN                             🌸");
            System.out.println("                                         🌸         2. SẮP XẾP ĐIỂM TRUNG BÌNH GIẢM DẦN                      🌸");
            System.out.println("                                         🌸         0. TRỞ LẠI MENU                          🌸");
            System.out.println("                                         🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸☆🌸");
            choice = Integer.parseInt(Validation.validation("Lựa chọn",Validation.CHOICE_REGEX));
            switch (choice){
                case 1 : {
                    studentService.sortUpScore();
                    break;
                }
                case 2 : {
                   studentService.sortDownScore();
                    break;
                }
            }
        }while (choice!=0);


    }


}
