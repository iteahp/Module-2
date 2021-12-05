package sumOfFiletext;

import java.io.*;
import java.util.Random;

public class ReadFileExample {
    public static void main(String[] args) {
        write("sumOfFileText.txt");
        read("sumOfFileText.txt");
    }
    public static void read(String link){
        try {
            FileReader fileReader = new FileReader(link);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line =null;
            int sum = 0;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = " +sum);
        } catch (FileNotFoundException e) {
            System.out.println("Không thấy thư mực");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void write(String link){
           FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(link);
                Random rd = new Random();
                for (int i = 0; i < 5; i++) {
                    fileWriter.write(""+ rd.nextInt(10)+"\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    }


