package ReadFile;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> reader(String filePath){
        List<String > list = new ArrayList<>();
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            String line = null;
            while ((line = br.readLine() ) !=null){
                String [] arr = line.split(",");
                list.add(arr[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tồn tại file ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
