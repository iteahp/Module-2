package view;

import io.ReadAndWriteFile;
import model.Account;
import model.Order;
import sevice.AccountService;
import sevice.ComputerService;
import sevice.OrderService;
import validation.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AccountView {
    Scanner scanner = new Scanner(System.in);
    AccountService accountService = new AccountService();
    ReadAndWriteFile<Account> readAndWriteFile = new ReadAndWriteFile<>();


    public void showAccount(){
        System.out.println("🌸☆🌸☆🌸☆🌸 Danh sách tài khoản 🌸☆🌸☆🌸☆🌸");
        for (Account account: accountService.findAll()
             ) {
            System.out.println(account);
        }
    }

    public void addAccount(){
        while (true){
            Account account = creatAccount();
            if (accountService.findIndexByAccount(account.getAccount())<0){
                accountService.save(account);
                System.out.println("🌸☆🌸☆🌸☆🌸 Đã đăng ký thành công 🌸☆🌸☆🌸☆🌸");
                return;
            }else System.err.println("🌸☆🌸☆🌸☆🌸 Tài khoản đã tồn  tại 🌸☆🌸☆🌸☆🌸");
        }

    }

    public Account creatAccount(){
        String account = Validation.validation("🌸☆🌸☆🌸☆🌸 Nhập tài khoản 🌸☆🌸☆🌸☆🌸","🌸☆🌸☆🌸☆🌸 Tài khoản phải có từ 5-16 ký tự🌸☆🌸☆🌸☆🌸 ",Validation.ACCOUNT_NAME_REGEX);
        String password = Validation.validation("🌸☆🌸☆🌸☆🌸 Nhập mật khẩu 🌸☆🌸☆🌸☆🌸","🌸☆🌸☆🌸☆🌸 Mật khẩu phải có từ 5-16 ký tự 🌸☆🌸☆🌸☆🌸 ",Validation.PASSWORD_REGEX);
        return new Account(account,password);
    }
    public void deleteAccount(){
        System.out.println("🌸☆🌸☆🌸☆🌸 Menu xóa tài khoản 🌸☆🌸☆🌸☆🌸");
        showAccount();
        int index = findIndexByAccount();
        if (index>=0){
            accountService.delete(index);
        }else System.err.println("🌸☆🌸☆🌸☆🌸 Không tồn tại account đã nhập 🌸☆🌸☆🌸☆🌸");
    }
    public int findIndexByAccount(){
        String account = Validation.validation("🌸☆🌸☆🌸☆🌸 Nhập Account 🌸☆🌸☆🌸☆🌸 ","🌸☆🌸☆🌸☆🌸 Không đúng định dạng - Nhập lại 🌸☆🌸☆🌸☆🌸",Validation.ACCOUNT_NAME_REGEX);
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
                    case 0: {
                        System.out.println("Đã trở lại");
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
            System.out.println("5. Nạp tiền cho tài khoản");
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
                case 5: {
                    int index = findIndexByAccount();
                    while (true){
                        if (index>=0){
                            double money = Double.parseDouble(Validation.validation("Nhập số tiền nạp :","Số tiền phải là số",Validation.MONEY_ACCOUNT_REGEX));
                            accountService.addMoneyToAccount(index,money);
                            System.out.println("Đã nạp "+money+" VNĐ vào tài khoản "+accountService.findAll().get(index).getAccount().toUpperCase(Locale.ROOT));
                            break;
                        }else System.err.println("Chưa có tài khoản này ");
                    }
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
        }while (choice!=0);

    }
    public void menuLoginUser(){
        ComputerView computerView = new ComputerView();
        ComputerService computerService = new ComputerService();

        int choice = -1;
        do {
            System.out.println("Menu Login User");
            System.out.println("1. Chọn máy ");
            System.out.println("0. Thoát");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1 : {
                    while (true){
                        if ( computerView.showComputerOffline()){
                            System.out.println("Chọn máy muốn chơi ");
                            int indexComputer = computerView.fineIndexByIdComputer();
                            if (indexComputer>=0){
                                if (!computerService.findAll().get(indexComputer).isStatus()){
                                    Account account = creatAccount();
                                    if (accountService.loginAccount(account)){
                                        computerService.start(indexComputer);
                                        int indexAccount = findIndexLoginAccount(account);
                                        accountService.start(indexAccount);
                                        menuUser(account,indexComputer,indexAccount);
                                    }else System.err.println("Tài khoản hoặc mật mã không đúng");
                                    break;
                                }else System.out.println("Máy đang online -- Nhập lại");
                            }else System.err.println("Không tìm thấy máy theo id nhập vào ");
                        }else break;
                        }


                    break;
                }
                case 0 :{
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
    public int findIndexLoginAccount(Account account){
        for (int i = 0; i < accountService.findAll().size(); i++) {
            if (account.getAccount().equals(accountService.findAll().get(i).getAccount())){
                return i;
            }
        }
        return -1;
    }
    public void menuUser(Account account,int indexComputer,int indexAccount){
        int choice = -1;
        do {
            System.out.println("Menu User ");
            System.out.println("1. Đổi mật khẩu");
            System.out.println("2. Gọi dịch vụ");
            System.out.println("3. Xem thông tin tài khoản");
            System.out.println("0. Đăng xuất");
            choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
            switch (choice){
                case 1 : {
                    changePasswordLoginUser(account,indexAccount);
                    break;
                }
                case 2 : {
                    addOrderLoginAccount(account,indexAccount);
                    break;
                }
                case 3 :{
                    if (accountService.loginAccount(account)){
                        System.out.println(accountService.findAll().get(indexAccount));
                    }else System.err.println("Tài khoản hoặc mật mã không đúng ");
                   break;
                }
                case 0 :{
                    ComputerService computerService = new ComputerService();
                    indexAccount = findIndexLoginAccount(account);
                    accountService.end(indexAccount);
                    computerService.resetComputer(indexComputer);
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

    private void addOrderLoginAccount(Account account,int indexAccount) {
        OrderView orderView = new OrderView();
        OrderService orderService =  new OrderService();
        indexAccount = findIndexLoginAccount(account);
         orderView.showOrder();
        while (true){
            int indexOrder = orderView.findIndexByIdOrder();
            if (indexOrder>=0){
                List<Order> newOrders = new ArrayList<>();
                newOrders.add(orderService.findAll().get(indexOrder));
                accountService.findAll().get(indexAccount).setOrder(newOrders);
                double money = accountService.findAll().get(indexAccount).getMoney()-orderService.findAll().get(indexOrder).getPrice();
                accountService.findAll().get(indexAccount).setMoney(money);
                System.out.println("Thêm dịch vụ thành công");
                break;
            }else System.err.println("Không tìm thấy dịch vụ theo ID nhập");
        }
    }

    private void changePasswordLoginUser(Account account,int indexAccount) {
        String passwordOld = Validation.validation("Nhập mật khẩu cũ","Mật khẩu phải có từ 5-16 ký tự",Validation.PASSWORD_REGEX);
        String passwordNew = Validation.validation("Nhập mật khẩu mới","Mật khẩu phải có từ 5-16 ký tự",Validation.PASSWORD_REGEX);
        String passwordNewAgain = Validation.validation("Nhập lại mật khẩu mới","Mật khẩu phải có từ 5-16 ký tự",Validation.PASSWORD_REGEX);
        if (passwordOld.equals(accountService.findAll().get(indexAccount).getPassword())){
            if (passwordNew.equals(passwordNewAgain)){
                accountService.findAll().get(indexAccount).setPassword(passwordNew);
            }else {
                System.err.println("Nhập mật khẩu mới lại không trùng nhau");
            }
        }else System.err.println("Mật khẩu cũ không đúng ");
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
                        }else System.err.println("Tài khoản hoặc mật mã không đúng");
                        break;
                }
                case 2 :{
                     menuLoginUser();
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
