package view;

import io.ReadAndWriteFile;
import model.Computer;
import sevice.ComputerService;
import validation.Validation;

import java.util.Scanner;

public class ComputerView {
    Scanner scanner = new Scanner(System.in);
    OrderView orderView = new OrderView();
    ComputerService computerService = new ComputerService();
    RevenueView revenueView = new RevenueView();
    AccountView accountView = new AccountView();
    ReadAndWriteFile<Computer> readAndWriteFile = new ReadAndWriteFile<>();
    public void computerShowList(){
        System.out.println("Danh sách có "+computerService.findAll().size()+" máy");
        for (Computer computer: computerService.findAll()) {
            if (computer.isStatus()){
                System.out.println(computer.toString()+", status = Avaiable");
            }else System.out.println(computer.toString()+", status = Disable");
        }
    }
    public Computer createComputer(){
        int id;
        if (computerService.findAll().size()==0){
            id = 1;
        }else {
            id = computerService.findAll().get(computerService.findAll().size()-1).getId()+1;
        }
        String name = Validation.validation(" Nhập tên máy ","Không đúng định dạng -- Vui lòng nhập lại",Validation.COMPUTER_NAME_REGEX);
        Computer computer = new Computer(id,name);
        return computer;
    }


    public void addComputer(){
        computerService.save(createComputer());
    }
    public void editComputer(){
       computerShowList();
        System.out.println("Bạn muốn thay đổi máy nào -- Hãy nhập id máy đó ");
        int index = fineIndexByIdComputer();
        System.out.println("Nhập tên muốn thay đổi ");
        String name =Validation.validation(" Nhập tên máy ","Không đúng định dạng -- Vui lòng nhập lại",Validation.COMPUTER_NAME_REGEX);
        computerService.findAll().get(index).setName(name);
        System.out.println(" Bạn đã thay đổi thành công ");
        readAndWriteFile.writeToFile(ComputerService.FILE_PATH, computerService.findAll());
    }
    public void showComputer(){
        int index = fineIndexByIdComputer();
        if (computerService.findAll().get(index).isStatus()){
            System.out.println("Time = "+ computerService.findAll().get(index).getDate()+" H"+"\t Money = "+computerService.findAll().get(index).getMoney()+" VNĐ");
        }else System.out.println("Máy đang offline ");
    }

    public int fineIndexByIdComputer(){
        int id = Integer.parseInt(Validation.validation("Nhập id computer","Id chỉ là số -- Nhập lại",Validation.ID));
        return   computerService.findIndexById(id);
    }

    public void deleteComputer(){
        while (true){
            System.out.println("Xóa máy");
            int index = fineIndexByIdComputer();
            if (index>=0){
                int choice = -1;
                do {
                    System.out.println("Tìm thấy máy có trong danh sách ---Bạn có muốn xóa không ");
                    System.out.println("1. Có ");
                    System.out.println("0. Không");
                    choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
                    switch (choice) {
                        case 1:{
                          computerService.delete(index);
                            System.out.println("Đã xóa xong");
                            choice =0;
                            break;
                      }
                        case 0:{
                            System.out.println("Bạn đã không xóa");
                            break;
                        }
                        default:{
                            System.err.println("Vui lòng nhập đúng danh mục");
                            break;
                        }
                    }
                }while (choice!=0);
            }else System.out.println("Không thấy máy có trong danh sách ");
            System.out.println("Bạn có muốn xóa tiếp không");
            System.out.println("Nếu không hãy ấn 'Q ' để trở lại menu --Hoặc nhấn 1 nút bất kỳ để xóa tiếp");
            String quit = scanner.nextLine();
            if (quit.equalsIgnoreCase("Q")){
                break;
            }
        }
    }
    public void menuComputerDisplay(){
        int choice = -1;
        do {
            System.out.println("1 . Hiện thị danh sách máy ");
            System.out.println("2 . Hiện thị chi tiết máy  ");
            System.out.println("0 . Trở về menu ");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1 :{
                    computerShowList();
                    break;
                }
                case 2 :{
                    showComputer();
                    break;
                }
                case 0: {
                    System.out.println("Đã trở lại ");
                    break;
                }
                default:{
                    System.err.println("Vui lòng nhập đúng danh mục");
                    break;
                }
            }
        }while (choice!=0);
    }
    public boolean showComputerOnline(){
        boolean isOnline = false;
        if (computerService.showComputerOnline().size()>0){
            isOnline = true;
            for (Computer computerOnline: computerService.showComputerOnline()
            ) {
                System.out.println("id = "+computerOnline.getId()+"\t"+computerOnline.getName() + "\t \t Avaiable");
            }
        }else System.out.println("Không có máy nào đang online cả");
        return isOnline;
    }
    public boolean showComputerOffline(){
        boolean isOffline = false;
        if (computerService.showComputerOffline().size()>0){
            isOffline = true;
            System.out.println("Danh sách các máy đang offline ");
            for (Computer computerOffline: computerService.showComputerOffline()
            ) {
                System.out.println( "id = "+computerOffline.getId()+"\t"+computerOffline.getName() + " \t Disable");
            }
        }else System.out.println("Không có máy nào đang offline cả");
        return  isOffline;
    }
    public void menuPay(){
        int choice = -1;
        do {
            System.out.println("Khách thanh toán tiền ");
            System.out.println("1. Tính tiền");
            System.out.println("2. Thêm dịch vụ cho khách");
            System.out.println("0. Thoát");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1 :{
                        pay();
                        break;
                }
                case 2: {
                   computerOrder();
                   break;
                }
                case 0: {
                    System.out.println("Đã trở lại");
                    break;
                }
                default:{
                    System.err.println("Vui lòng nhập đúng danh mục");
                    break;
                }
            }
        }while (choice !=0);


    }
    public void pay(){
        System.out.println("Tính tiền cho khách ");
        if (showComputerOnline()){
            int indexComputer = fineIndexByIdComputer();
            computerService.end(indexComputer);
            System.out.println("Số tiền cần thanh toán ="+computerService.pay(indexComputer));
            computerService.resetComputer(indexComputer);
        }
    }
    public void computerOrder(){
        System.out.println("Thêm dịch vụ cho khách");
        showComputerOnline();
        int indexComputer = fineIndexByIdComputer();
        orderView.showOrder();
        int indexOrder = orderView.findIndexByIdOrder();
        computerService.computerOrder(indexComputer,indexOrder);
        System.out.println(" Đã thêm dịch vụ xong");
    }
    public void startComputer(){
        System.out.println("Bật máy cho khách");
        if (showComputerOffline()){
            int index = fineIndexByIdComputer();
            computerService.start(index);
            System.out.println("Đã bật " +computerService.findAll().get(index).getName());
        }
    }
    public void editMoneyOnHour(){
        System.out.println("Menu chỉnh sửa tiền theo giờ ");
        double moneyOnHour =Double.parseDouble(Validation.validation("Nhập giá tiền muốn đổi ","Không đúng định dạng - Nhập lại",Validation.MONEY_ON_HOUR_REGEX));
        for (Computer computer: computerService.findAll()
             ) {
            computer.setMoneyOnHour(moneyOnHour/3600);
        }

        System.out.println("Chỉnh sửa xong với giá "+moneyOnHour+" Vnd / H");
    }
    public void menuComputer() {
        int choice = -1;
        do {
            System.out.println("Menu chức năng");
            System.out.println("1 . Hiện thị danh sách máy ");
            System.out.println("2 . Thêm 1 máy mới vào danh sách ");
            System.out.println("3 . Sửa đổi thông tin của máy ");
            System.out.println("4 . Xóa 1 máy khỏi danh sách  ");
            System.out.println("5 . Dịch vụ ");
            System.out.println("6 . Bật máy  ");
            System.out.println("7 . Tính tiền ");
            System.out.println("8 . Quản lý tài khoản đăng nhập ");
            System.out.println("9 . Doanh thu ");
            System.out.println("10 . Chỉnh sửa tính tiền theo giờ  ");
            System.out.println("0 . Đăng xuất ");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice) {
                case 1: {
                    menuComputerDisplay();
                    break;
                }
                case 2: {
                        addComputer();
                        break;
                }
                case 3: {
                        editComputer();
                        break;
                }
                case 4: {
                        deleteComputer();
                        break;
                }
                case 5: {
                        orderView.menuOrder();
                        break;
                }
                case 6: {
                    startComputer();
                    break;
                }
                case 7: {
                        menuPay();
                        break;
                }
                case 8: {
                        accountView.menuAccount();
                        break;
                }
                case 9: {
                        revenueView.menuRevenue();
                        break;
                }
                case 10: {
                    editMoneyOnHour();
                    break;
                }
                case 0 : {
                    System.out.println("Đã trở lại ");
                    break;
                }
                default:{
                    System.err.println("Vui lòng nhập đúng danh mục");
                    break;
                }
            }

        }while (choice!=0);

    }
}
