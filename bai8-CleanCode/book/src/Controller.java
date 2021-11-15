import java.util.Scanner;

public class Controller {
  static   Scanner scanner = new Scanner(System.in);

    public static Book[] insert(Book[] listBook){
        Book[] newListBook = new Book[listBook.length+1];
        System.out.println("Nhập vị trí muốn chèn ");
        int index = scanner.nextInt();
        for (int i = 0; i < newListBook.length; i++) {
            if (i<index){
                newListBook[i]=listBook[i];
            }else {
                newListBook[i+1]=newListBook[i];
            }
            newListBook[index] = create();
        }
        return newListBook;
    }
    public static Book create(){
        scanner.nextLine();
        System.out.println("Nhập tên :");
        String name= scanner.nextLine();
        System.out.println("Nhập ngôn ngữ ");
        String language = scanner.nextLine();
        System.out.println("Nhập tác giả ");
        String author = scanner.nextLine();
        System.out.println("Nhập số lượng ");
        int amount = scanner.nextInt();
        Book book = new Book(name,language,author,amount);
        return book;
    }
    public static void show(Book[] listBook){
        for (int i = 0; i < listBook.length; i++) {
            System.out.println(listBook[i].toString());
        }
    }
    public static Book[] remove(Book[] listBook){
        Book[] newListBook = new Book[listBook.length -1];
        System.out.println("Nhập vị trí muốn xóa ");
        int index = scanner.nextInt();
        for (int i = 0; i < newListBook.length; i++) {
            if (i<index){
                newListBook[i] = listBook[i];
            }else {
                newListBook[i-1] = listBook[i];
            }
        }
        return newListBook;
    }
    public static Book[] update (Book[] listBook){
        Book[] newListBook = new Book[listBook.length +1];
        for (int i = 0; i < listBook.length; i++) {
            newListBook[i] =listBook[i];
        }
        newListBook[newListBook.length-1] = create();
        return newListBook;
    }


}
