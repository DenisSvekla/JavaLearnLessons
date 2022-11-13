package Lessons.Lesson14.workWithDare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
        int years = scanner.nextInt();
        System.out.println("Введите месяц своего рождения");
        int month = scanner.nextInt();
        System.out.println("Введите день своего рождения");
        int day = scanner.nextInt();

        LocalDate localDate = LocalDate.parse(years + "" + month + "" + day + "", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate);
        }
    }

