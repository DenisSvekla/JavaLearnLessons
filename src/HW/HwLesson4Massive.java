package HW;

import java.util.Arrays;
import java.util.Scanner;

public class HwLesson4Massive {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи целое положительное число для определения длинны массива");
        double[] commonMas = new double[scanner.nextInt()];
        System.out.println("Для выполнения задания, выбери из двух вариантов, как его выполнять, введи 1 или 2");
        System.out.println("1. используя метод Random в классе Math");
        System.out.println("2. заполняя элементы массива вручную");

        int option = scanner.nextInt();
        if (option == 1) {
            for (int i = 0; i < commonMas.length; i++) {
                commonMas[i] = Math.random();
            }
        } else if (option == 2) {
            for (int i = 0; i < commonMas.length; i++) {
                System.out.println("Введите " + (i + 1) + "-ое число в массиве");
                commonMas[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Попробуйте снова, таких вариантов нет");
            System.exit(0);
        }

        System.out.println("***** Задание 1 *****");
        System.out.println("Вывод массива в прямом порядке");
        for (double a : commonMas) {
            System.out.println(a);
        }

        System.out.println("Вывод массива в обратном порядке порядке");
        for (int i = commonMas.length - 1; i >= 0; i--) {
            System.out.println(commonMas[i]);
        }

        System.out.println("***** Задание 2 *****");
        System.out.println("Ищем минимальный и максимальный элемент в массиве");

        double minValue = commonMas[0];
        double maxValue = commonMas[0];

        for (int i = 0; i < commonMas.length; i++) {
            if (commonMas[i] > maxValue) {
                maxValue = commonMas[i];
            } else if (commonMas[i] < minValue) {
                minValue = commonMas[i];
            }
        }
        System.out.println("Минимальное значение в массиве " + minValue);
        System.out.println("Максимальное значение в массиве " + maxValue);

        System.out.println("***** Задание 3 *****");
        System.out.println("Ищем индексы минимальных и максимальных значений, используя данные со второго задания");
        for (int i = 0; i < commonMas.length; i++) {
            if (commonMas[i] == maxValue) {
                System.out.println("Индекс максимального значения в массиве равен " + i);
            } else if (commonMas[i] == minValue) {
                System.out.println("Индекс минимального значения в массиве равен " + i);
            }
        }

        System.out.println("***** Задание 4 *****");
        System.out.println("Ищем количество нулевых значений в массиве");
        int zeroValueInMas = 0;
        for (int i = 0; i < commonMas.length; i++) {
            if (commonMas[i] == 0) {
                zeroValueInMas++;
            }
        }
        if (zeroValueInMas > 0) {
            System.out.println("Количество нулевых элементов в массиве равно " + zeroValueInMas);
        } else if (zeroValueInMas == 0) {
            System.out.println("В массиве нет нулевых элементов");
        }

        System.out.println("***** Задание 5 *****");
        System.out.println("Меняем местами значения в массиве");

        int middleMass = 0;

        if (commonMas.length % 2 == 0) {
            middleMass = commonMas.length / 2;
        } else {
            middleMass = (commonMas.length - 1) / 2;
        }

        for (int i = 0, j = commonMas.length - 1; i < middleMass; i++, j--) {
            double thirdElementForReplace = 0;
            thirdElementForReplace = commonMas[i];
            commonMas[i] = commonMas[j];
            commonMas[j] = thirdElementForReplace;
        }

        System.out.println("Массив с замененными значениями (первый с последним, второй с " +
                "предпоследним и т. д.) ");
        System.out.println(Arrays.toString(commonMas));


        System.out.println("***** Задание 6 *****");
        System.out.println("Проверяем, является ли массив возрастающей последовательностью");

        double elementToCompare = commonMas[0];
        for (int i = 1; i < commonMas.length; i++) {
            if (elementToCompare < commonMas[i]) {
                elementToCompare = commonMas[i];
                if (i == commonMas.length - 1) {
                    System.out.println("Массив  является возрастающей последовательностью");
                }
            } else {
                System.out.println("Массив не является возрастающей последовательностью");
                break;
            }
        }
    }
}
