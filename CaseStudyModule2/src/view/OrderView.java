package view;

import io.ReadAndWriteFile;
import model.Order;
import sevice.OrderService;
import validation.Validation;

import java.util.Scanner;

public class OrderView {
        Scanner scanner  = new Scanner(System.in);
        OrderService orderService = new OrderService();
        ReadAndWriteFile<Order> readAndWriteFile = new ReadAndWriteFile<>();
        public void showOrder(){
                for (Order order: orderService.findAll()) {
                        System.out.println(order);
                }
        }
        public void addOrder(){
                orderService.save(creatOrder());
        }
        public Order creatOrder(){
                System.out.println("Thêm dịch vụ : ");
                int id;
                if (orderService.findAll().size()==0){
                        id = 1;
                }else {
                        id = orderService.findAll().get(orderService.findAll().size()-1).getId()+1;
                }

                String name = Validation.validation("Nhập tên dịch vụ","Không đúng định dạng-- Vui lòng nhập lại",Validation.ORDER_NAME_REGEX);
                double price = Double.parseDouble(Validation.validation("Nhập giá dịch vụ","Không đúng định dạng -- Nhập lại",Validation.ORDER_PRICE_REGEX));
                Order order = new Order(id,name,price);
                return order;
        }
        public int findIndexByIdOrder(){
                int id = Integer.parseInt(Validation.validation("Nhập id dịch vụ","Id chỉ là số -- Nhập lại",Validation.ID));
                return orderService.findIndexById(id);
        }
        public void deleteOrder(){
                int index = findIndexByIdOrder();
                if (index>=0){
                        orderService.delete(index);
                }else System.out.println("Không thấy có trong danh sách dịch vụ ");
        }
        public void editOrder(){
                int index = findIndexByIdOrder();
                if (index>=0){
                        int choice = -1;
                        do {
                                System.out.println("Bạn muốn thay đổi phần nào ");
                                System.out.println("1. Thay đổi tên");
                                System.out.println("2. Thay đổi giá");
                                System.out.println("0. Trở lại ");
                                choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
                                switch (choice){
                                        case 1 :{
                                                System.out.println("Nhập tên mới ");
                                                orderService.findAll().get(index).setName(scanner.nextLine());
                                                System.out.println("Thay đổi xong ");
                                                break;
                                        }

                                        case 2 :{
                                                System.out.println("Nhập giá mới ");
                                                double price = Double.parseDouble(scanner.nextLine());
                                                orderService.findAll().get(index).setPrice(price);
                                                System.out.println("Thay đổi xong ");
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
                }else System.out.println("Không thấy có trong danh sách dịch vụ ");
                readAndWriteFile.writeToFile(OrderService.FILE_PATH, orderService.findAll());
        }
        public void menuOrder(){
                int choice = -1;
                do {
                        System.out.println("Menu dịch vụ ");
                        System.out.println("1. Hiển thị danh sách dịch vụ");
                        System.out.println("2. Thêm dịch vụ ");
                        System.out.println("3.Sửa dịch vụ ");
                        System.out.println("4. Xóa dịch vụ");
                        System.out.println("0. Trở lại ");
                        choice = Integer.parseInt(Validation.validation("Lựa chọn","Không đúng định dạng - Vui lòng nhập lại",Validation.CHOICE));
                        switch (choice){
                                case 1 : {
                                        showOrder();
                                        break;
                                }
                                case 2: {
                                        addOrder();
                                        break;
                                }
                                case 3: {
                                        editOrder();
                                        break;
                                }
                                case 4 :{
                                        deleteOrder();
                                        break;
                                }
                                case 0: {
                                        System.out.println("Đã trở lại ");
                                }
                                default:{
                                        System.err.println("Vui lòng nhập đúng danh mục");
                                        break;
                                }
                        }
                }while (choice!=0);


        }
}
