package view;

import io.ReadAndWriteFile;
import model.Account;
import sevice.AccountService;
import validation.Validation;

import java.util.Scanner;

public class AccountView {
    Scanner scanner = new Scanner(System.in);
    AccountService accountService = new AccountService();
    ReadAndWriteFile<Account> readAndWriteFile = new ReadAndWriteFile<>();


    public void showAccount(){
        System.out.println("Danh sách tài khoản");
        for (Account account: accountService.findAll()
             ) {
            System.out.println(account);
        }
    }

    public void addAccount(){
        Account account = creatAccount();
        while (true){
            if (accountService.findIndexByAccount(account.getAccount())<0){
                accountService.save(account);
                System.out.println("Đã đăng ký thành công");
                return;
            }else System.err.println("Tài khoản đã tồn  tại");
        }

    }

    public Account creatAccount(){
        String account = Validation.validation("Nhập tài khoản","Tài khoản phải có từ 5-16 ký tự",Validation.ACCOUNT_NAME_REGEX);
        String password = Validation.validation("Nhập mật khẩu","Mật khẩu phải có từ 5-16 ký tự",Validation.PASSWORD_REGEX);
        return new Account(account,password);
    }
    public void deleteAccount(){
        System.out.println("Menu xóa tài khoản");
        showAccount();
        int index = findIndexByAccount();
        if (index>=0){
            accountService.delete(index);
        }else System.err.println("Không tồn tại account đã nhập");
    }
    public int findIndexByAccount(){
        System.out.println("Nhập account ");
        String account = Validation.validation("Nhập Account","Không đúng định dạng - Nhập lại",Validation.ACCOUNT_NAME_REGEX);
        return accountService.findIndexByAccount(account);
    }
    public void editAccount(){
        int index = findIndexByAccount();
        if (index>=0){
            int choice =-1;
            do {
                System.out.println("Đổi mật khẩu hay tài khoản");
                System.out.println("1. Đổi tài khoản");
                System.out.println("2. Đổi mật khẩu");
                System.out.println("0. Trở lại");
                choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
                switch (choice){
                    case 1:{
                        while (true){
                            String account = Validation.validation("Nhập tài khoản","Tài khoản phải có từ 5-16 ký tự",Validation.ACCOUNT_NAME_REGEX);
                            if (accountService.findIndexByAccount(account)>=0){
                                System.err.println("Tài khoản đã tồn tại");
                            }else {
                                accountService.findAll().get(index).setAccount(account);
                                System.out.println("Đổi tài khoản thành công");
                                return;
                            }
                        }

                    }
                    case 2: {
                        String password = Validation.validation("Nhập mật khẩu","Mật khẩu phải có từ 5-16 ký tự",Validation.PASSWORD_REGEX);
                        accountService.findAll().get(index).setPassword(password);
                        System.out.println("Đổi mật khẩu thành công");
                        break;
                    }
                    default:{
                        System.err.println("Vui lòng nhập đúng danh mục");
                        break;
                    }
                }
            }while (choice!=0);


        }
        readAndWriteFile.writeToFile(AccountService.FILE_PATH,accountService.findAll());
    }
    public void menuAccount(){
        int choice = -1;
        do {
            System.out.println("Menu tài khoản");
            System.out.println("1. Thêm mới");
            System.out.println("2. Đổi mật khẩu,tài khoản");
            System.out.println("3. Xóa");
            System.out.println("4. Hiện thị danh sách tài khoản");
            System.out.println("0. Trở lại");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1: {
                    addAccount();
                    break;
                }
                case 2: {
                    editAccount();
                    break;
                }
                case 3: {
                    deleteAccount();
                    break;
                }
                case 4 : {
                    showAccount();
                    break;
                }
                case 0: {
                    System.out.println("Đã trở lại");
                }
                default:{
                    System.err.println("Vui lòng nhập đúng danh mục");
                    break;
                }
            }
        }while (choice!=0);

    }
    public void menuLogin(){
        ComputerView computerView = new ComputerView();
        int choice =-1;
        do{
            System.out.println("Menu Login");
            System.out.println("1. Đăng nhập ADMIN ");
            System.out.println("2. Đăng nhập USER ");
            System.out.println("0 . Thoát");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1 : {
                    Account account = creatAccount();
                        if (accountService.loginAdmin(account)){
                            computerView.menuComputer();
                        }else System.out.println("Tài khoản hoặc mật mã không đúng");
                        break;
                }
                case 2 :{
                        break;
                }
                case 0:{
                    System.out.println("Xin cảm ơn và hẹn gặp lại");
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
