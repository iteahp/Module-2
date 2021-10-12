package Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[10] ;
        input(listBook);
        output(listBook);
        System.out.println("Tổng tiền là: " + calculatorTotalPrice(listBook));
        findAllByName("3", listBook);

    }
    public static void  input(Book[] listBook){
        for (int i = 0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào thông tin :");
            String name = scanner.nextLine();
            String category = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            int amount = scanner.nextInt();
            scanner.nextLine();
            Book book = new Book(name,price,amount,category,author);
            listBook[i] = book;
        }
    }
    public static void output(Book[] listBook){
        for (int i = 0;i<3;i++){
            System.out.println(listBook[i]);
        }
    }
    public static double calculatorTotalPrice(Book[] listBook){
        int sum =0;
        for (int i =0;i<3;i++){
            sum+=listBook[i].price* listBook[i].amount;
        }
        return sum;
    }
    public static void findAllByName(String name,Book[] listBook){
        for (int i = 0; i < 3; i++) {
            if (listBook[i].name.equals(name)) {
                System.out.println(listBook[i]);
            }
        }
    }


}
