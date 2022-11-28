package Lessons.lesson12;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C://Text.txt");
        System.out.printf("File size: %d bytes \n", fileInputStream.available());
        StringBuilder result = new StringBuilder();
        int i = -1;
        while ((i = fileInputStream.read()) !=-1) {
            result.append((char) i);
        }
        fileInputStream.close();
        System.out.println(result);
    }
}
