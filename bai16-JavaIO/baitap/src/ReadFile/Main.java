package ReadFile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<String> list = readFile.reader("readFile.txt");
        for (String str: list
             ) {
            System.out.println(str);
        }
    }
}
