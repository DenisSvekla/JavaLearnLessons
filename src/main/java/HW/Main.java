package HW;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой айпи адресс для валидации");
        String ipAdress = scanner.nextLine();
        System.out.println(checkApiAdress(ipAdress));
        FileReader fileReader = new FileReader("C://1.txt");
        System.out.println(readAndWriteImportantInfoFromFile(fileReader));
        fileReader.close();

    }

    public static String checkApiAdress(String generateText) {
        String result;
        Pattern pattern = Pattern.compile("([0-9]{0,3}[.]){3}[0-9]{0,3}");
        Matcher matcher = pattern.matcher(generateText);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            builder.append(matcher.group());
        }
        if (generateText.equals(builder.toString())) {
            result = "Api адресс валидный";
        } else {
            result = "Api адресс не валидный";
        }
        return result;
    }

    public static Map<String, String> readAndWriteImportantInfoFromFile(FileReader fileReader) throws IOException {
        Map<String, String> allData = new HashMap<>();
        StringBuilder builders = new StringBuilder();

        int c = -1;
        while ((c = fileReader.read()) != -1) {
            builders.append((char) c);
        }

        // поиск номера документа в тексте
        Pattern digitsInDocNumber = Pattern.compile("([0-9]{2,4}[\\-]){2}[0-9]{2}");
        Matcher docMatcher = digitsInDocNumber.matcher(builders.toString());
        docMatcher.find();
        try {
            docMatcher.group();
            allData.put("document number", docMatcher.group());
        } catch (IllegalStateException e) {
            System.out.println("В тексте отсутствует номер документа");
        }

        //поиск email
        Pattern email = Pattern.compile("[A-z0-9.%_+-]+@[A-z]{2,6}+.[A-z]{1,3}");
        Matcher emailMatcher = email.matcher(builders.toString());
        emailMatcher.find();
        try {
            emailMatcher.group();
            allData.put("email", emailMatcher.group());
        } catch (IllegalStateException e) {
            System.out.println("В тексте отсутствует email");
        }

        //поиск телефона
        Pattern phone = Pattern.compile("\\+[(][0-9]{2}[)][0-9]{7}");
        Matcher phoneMatcher = phone.matcher(builders.toString());
        phoneMatcher.find();
        try {
            phoneMatcher.group();
            allData.put("phone", phoneMatcher.group());
        } catch (IllegalStateException e) {
            System.out.println("В тексте отсутствует phone");
        }
        return allData;
    }
}

