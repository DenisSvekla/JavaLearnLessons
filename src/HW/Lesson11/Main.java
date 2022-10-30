package HW.Lesson11;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        String[] massive = new String[2];
        try {
            for (int i = 0; i < massive.length + 1; i++) {
                massive[i] = "123";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            int x = 10;
            int y = x / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int x = 10;
            int y = x / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i <= massive.length; i++) {
                massive[i] = "1123";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End class");
        }
    }
}
