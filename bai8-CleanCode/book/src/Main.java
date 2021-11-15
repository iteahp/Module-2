import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[3];
        listBook[0] = new Book("ngày ấy","việt nam","xuân diệu",5);
        listBook[1] = new Book("ngày xưa","nhật bản","xuân quỳnh",6);
        listBook[2] = new Book("ngày nay","mỹ","xuân tóc đỏ",7);
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.println(" BOOK MANAGEMENT SYSTEM ");
            System.out.println("1 . Insert ");
            System.out.println("2 . Remove ");
            System.out.println("3 . Update ");
            System.out.println("4 . Search ");
            System.out.println("5 . Sort ");
            System.out.println("6 . Show ");
            System.out.println("7 . Exit ");
            System.out.println(" Your Choice ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    listBook = Controller.insert(listBook);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    Controller.show(listBook);
                    break;
                case 7:
                    break;

            }
        }

    }
}
