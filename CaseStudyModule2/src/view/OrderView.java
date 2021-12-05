package view;

import model.Order;
import sevice.OrderService;
import validation.Validation;

import java.util.Scanner;

public class OrderView {
        Scanner scanner  = new Scanner(System.in);
        OrderService orderService = new OrderService();
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
                System.out.println("Nhập giá ");
                double price = Double.parseDouble(Validation.validation("Nhập giá dịch vụ","Không đúng định dạng -- Nhập lại",Validation.ORDER_PRICE_REGEX));
                Order order = new Order(id,name,price);
                return order;
        }
        public int findIndexByIdOrder(){
                System.out.println("Nhập id order ");
                int id = Integer.parseInt(scanner.nextLine());
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
                                choice = Integer.parseInt(scanner.nextLine());
                                switch (choice){
                                        case 1 :
                                                System.out.println("Nhập tên mới ");
                                                orderService.findAll().get(index).setName(scanner.nextLine());
                                                break;
                                        case 2 :
                                                System.out.println("Nhập giá mới ");
                                                double price = Double.parseDouble(scanner.nextLine());
                                                orderService.findAll().get(index).setPrice(price);
                                                break;
                                }
                                System.out.println("Thay đổi xong ");
                        }while (choice!=0);
                }else System.out.println("Không thấy có trong danh sách dịch vụ ");
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
                        choice = Integer.parseInt(scanner.nextLine());
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
                        }
                }while (choice!=0);


        }
}
