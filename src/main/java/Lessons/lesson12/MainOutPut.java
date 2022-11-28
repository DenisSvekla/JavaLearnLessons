package Lessons.lesson12;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainOutPut {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C://1.txt");
        String text = "Hello world";
        byte[] bb = text.getBytes();
        fileOutputStream.write(bb);
        fileOutputStream.close();
    }
}
