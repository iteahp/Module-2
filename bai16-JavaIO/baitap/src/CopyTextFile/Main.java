package CopyTextFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReaderAndWriter readerAndWriter = new ReaderAndWriter();
      List list = readerAndWriter.reader("sourceFile.txt");
        readerAndWriter.writer("result.txt",list);
    }
}
