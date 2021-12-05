package sumNumberInFile;

import javafx.scene.shape.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String path = "C:\\Users\\MSI\\Desktop\\Module2\\bai16-JavaIO\\thuchanh\\src\\sumNumberInFile\\text.txt";
        try {
            FileInputStream file = new FileInputStream(path);
            int data ;
            while ((data = file.read()) != -1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" không có file như vậy");
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            String message = "Xin chào mọi người ";
            fileOutputStream.write(message.getBytes());
            fileOutputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("Không có file tương ứng");
        } catch (IOException e) {
            System.out.println("Có lỗi rồi");
        }
    }
}
