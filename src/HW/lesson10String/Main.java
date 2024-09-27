package HW.lesson10String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] mString = new String[3];
        for (int i = 0; i < mString.length; i++) {
            System.out.println("Введите " + (i + 1) + "-ое слово");
            mString[i] = scanner.nextLine();
        }

        //Задача 1 найти самую короткую и длинную строку
        int maxLength = mString[0].length();
        int minLength = mString[0].length();

        for (int i = 0; i < mString.length; i++) {
            System.out.println("Длина " + (i + 1) + "-го слова равна " + mString[i].length());
            if (maxLength < mString[i].length()) {
                maxLength = mString[i].length();
            }
            if (minLength > mString[i].length()) {
                minLength = mString[i].length();
            }
        }

        System.out.println("Минимальная длинна слова из массива равна " + minLength);
        System.out.println("Максимальная длинна слова из массива равна " + maxLength);

        //Задача 2 упорядочить и вывести строки в порядке возврастания
        for (int i = 0; i < mString.length - 1; i++) {
            if (mString[i].length() > mString[i + 1].length()) {
                var newElement = mString[i];
                mString[i] = mString[i + 1];
                mString[i + 1] = newElement;
            }
        }

        for (String e : mString) {
            System.out.println(e);
        }

        //Задача 3 вывести все строки, длина которых меньше средней
        double middleLength = mString[0].length();

        for (int i = 1; i < mString.length; i++) {
            middleLength = (middleLength + mString[i].length()) / 2;
        }

        for (int i = 0; i < mString.length; i++) {
            if (middleLength > mString[i].length()) {
                System.out.println("Срока длина которой меньше средней " + mString[i] + " и ее длина " + mString[i].length());
            }
        }

        //Задание 4 Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
        for (int i = 0; i < mString.length; i++) {
            if (differentSymbols(mString[i]) == 0) {
                System.out.println("Это слово не имеет одинаковых символов " + mString[i]);
                break;
            } else if (i == mString.length - 1) {
                System.out.println("Нет слов, которые не имеют одинаковые символы");
            }
        }

        //Задание 5 Среди слов, состоящих только из цифр, найти слово-палиндром.
        for (int i = 0; i < mString.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(mString[i]);
            stringBuilder.reverse();
            Boolean reverse = mString[i].contentEquals(stringBuilder);
            if (reverse) {
                System.out.println("Это слово-палиндром " + mString[i]);
            }
        }
    }

    static int differentSymbols(String word) {
        int commonCount = 0;
        for (int i = 0; i < word.length(); i++) {
            commonCount = 0;
            if (commonCount == 0) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j) && i != j) {
                        commonCount++;
                        break;
                    }
                }
            }
        }
        return commonCount;
    }
}








