package minitest.controller;

import minitest.controller.service.StudentService;
import minitest.controller.validation.Validation;
import minitest.controller.view.StudentView;

public class Controller {
    StudentView studentView = new StudentView();
    StudentService studentService  = new StudentService();
    public void menuStudent(){
        int choice = -1;
        do {
            studentView.menuStudent();
            choice =Integer.parseInt(Validation.validation("Lựa chọn ",Validation.CHOICE_REGEX));
            switch (choice){
                case 1 : {
                    studentView.show();
                    break;
                }
                case 2 : {
                    studentView.add();
                    break;
                }
                case 3: {
                    studentView.edit();
                    break;
                }
                case 4 :{
                    studentView.delete();
                    break;
                }
                case 5 : {
                    studentView.menuSort();
                    break;
                }
                case 6 :{
                    studentService.readFile("student.txt");
                        break;
                }
                case 7 :{

                    break;
                }
                case 0: {
                    System.out.println("Chào tạm biệt");
                    break;
                }
                default: {
                    System.out.println("Vui lòng chọn từ 0-7");
                    break;
                }
            }
        }while (choice!=0);
    }
}
