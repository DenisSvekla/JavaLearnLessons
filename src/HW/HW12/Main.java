package HW.HW12;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C://romeo-and-juliet.txt");
        StringBuilder allText = new StringBuilder();
        int c = -1;
        while ((c = fileReader.read()) != -1) {
            allText.append((char) c);
        }
        fileReader.close();

        String allTextInString = allText.toString();

        String[] dd = allTextInString.split("\\W");
        for (String ddd : dd) {
            System.out.println(ddd);
        }

        int maxLenght = dd[0].length();
        String maxValue = " ";

        for (int i = 0; i < dd.length; i++) {
            if (maxLenght < dd[i].length()) {
                maxLenght = dd[i].length();
                maxValue = dd[i];
            }
        }
        System.out.println("Слово которое имеет наибольшее количество символов " + maxValue);
    }
}

