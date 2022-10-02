package HW;

import java.util.Scanner;


public class HW_DenisSvekla_C61_lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задание 1.1
        System.out.println("*** Задание 1.1");
        System.out.println("Введите пожалуйста положительное целое число для определения месяца");
        int numberMonth = scanner.nextInt();
        switch (numberMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибся, такого не сущетсвует, а ну ка попробуй еще раз!!");
        }

        // Задание 1.2
        System.out.println("*** Задание 1.2");
        System.out.println("Введите порядковый номер месяца");
        int numberMonthYet = scanner.nextInt();
        if (numberMonthYet == 1) {
            System.out.println("Январь");
        } else if (numberMonthYet == 2) {
            System.out.println("Февраль");
        } else if (numberMonthYet == 3) {
            System.out.println("Март");
        } else if (numberMonthYet == 4) {
            System.out.println("Апрель");
        } else if (numberMonthYet == 5) {
            System.out.println("Май");
        } else if (numberMonthYet == 6) {
            System.out.println("Июнь");
        } else if (numberMonthYet == 7) {
            System.out.println("Июль");
        } else if (numberMonthYet == 8) {
            System.out.println("Август");
        } else if (numberMonthYet == 9) {
            System.out.println("Сентябрь");
        } else if (numberMonthYet == 10) {
            System.out.println("Октябрь");
        } else if (numberMonthYet == 11) {
            System.out.println("Ноябрь");
        } else if (numberMonthYet == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Мда, с нумерацией месяцев у тебя проблема");
        }

        // Задание 1.3
        System.out.println("*** Задание 1.3");
        System.out.println("Давай поиграем в игру, ты вводишь целое число а я говорю четное оно или нет.");

        do {
            System.out.println("Введи число");
            int digit = scanner.nextInt();
            if (digit % 2 == 0) {
                System.out.println("Твое число четное");
            } else {
                System.out.println("Твое число нечетное");
            }
            System.out.println("Продолжим?");
            System.out.println("YES");
            System.out.println("NO");
            String answer = scanner.next();

            if (answer.equals("NO")) {
                break;
            }
        } while (true);

        //Задание 1.4
        System.out.println("*** Задание 1.4");
        System.out.println("А теперь расскажи мне какая у тебя температура на улице. " +
                "Ток вводи целые числа, я не пойму твои три десятых и т.д");
        int temperature = scanner.nextInt();
        System.out.print("Да у тебя ");
        if (temperature > -5) {
            System.out.print("тепло");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.print("нормально");
        } else if (temperature <= -20) {
            System.out.print("холодно");
        }
        System.out.println();

        //Задание 2.1
        System.out.println("*** Задание 2.1");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        //Задание 2.2
        System.out.println("*** Задание 2.2");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 2.3
        System.out.println("*** Задание 2.3");
        System.out.println("Забыл про меня? Давай я покажу, как я складываю числа. Введи любое положительное число " +
                "а я суммирую все числа от одного до твоего введенного");
        int sumDigits = 0;
        int anyDigit = scanner.nextInt();
        for (int i = 0; i <= anyDigit; i++) {
            sumDigits = sumDigits + i;
        }
        System.out.println(sumDigits);

        //Задание 2.4
        System.out.println("*** Задание 2.4");
        int lastDigitOfCycle = 1;
        while (lastDigitOfCycle < 100) {
            lastDigitOfCycle++;
            if (lastDigitOfCycle % 7 == 0) {
                System.out.print(lastDigitOfCycle + " ");
            }
        }
        System.out.println();

        //Задание 2.5
        System.out.println("*** Задание 2.5");
        for (int i = 0; i < 10; i++) {
            System.out.print(i * -5 + " ");
        }
        System.out.println();

        //Задание 2.6
        System.out.println("*** Задание 2.6");
        for (int i = 10; i < 21; i++) {
            System.out.print(Math.pow(i, 2) + " ");
        }
    }
}
