package Lessons.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWritter {

    public static void main(String[] args) throws IOException {


        FileReader fileReader = new FileReader("C://1.txt");
        StringBuilder builder = new StringBuilder();
        int c = -1;
        while ((c = fileReader.read()) !=-1) {
            builder.append((char) c);
        }
        System.out.println(builder);
        fileReader.close();

        FileWriter writer = new FileWriter("C://1.txt");
        String text = " Hi, My name is ";
        writer.write(text);
        writer.close();

    }
}
