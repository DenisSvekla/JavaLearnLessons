package Lessons.lesson12.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("C://result.txt");
        byte[] bb = scanner.nextLine().getBytes();
        fileOutputStream.write(bb);

        FileInputStream fileInputStream = new FileInputStream("C://result.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        while ((i = fileInputStream.read()) != -1) {
            stringBuilder.append((char) i);
        }

        String textIn = stringBuilder.toString();
        System.out.println(textIn.replace(" ", "_"));


    }
}
