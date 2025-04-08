package comp.examples.codes.exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
        public static void fileRead() throws IOException {
            FileReader fileReader = new FileReader("C:/Users/priya/OneDrive/Desktop/New Text Document.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        }

    public static void main(String[] args) {
        try {
            FileException.fileRead();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}



