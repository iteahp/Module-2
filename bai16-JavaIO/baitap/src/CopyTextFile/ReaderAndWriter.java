package CopyTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public List<String> reader(String filePath){
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) !=null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tồn tại file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void writer(String filePath, List<String> list){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i)+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
