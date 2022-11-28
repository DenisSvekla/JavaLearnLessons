package Lessons.lesson4_massive_for_each;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
//        String arrayString[] = new String[5];
//
//
//        int arrayInt[] = new int[5];
//        arrayInt[2] = 10;
//        System.out.println(arrayInt[1]);
//        System.out.println(arrayInt[2]);
//
//        int dayesOfTheWeek[] = {1,2,3,4,5,6,7};
//        System.out.println(dayesOfTheWeek[3]);
//
//        System.out.println(dayesOfTheWeek.length); // длина элементов
//
//        for (int i = dayesOfTheWeek.length - 1; i>=0; i--) {
//            System.out.println(dayesOfTheWeek[i]);
//        }
//
//        //Создать пустой массив типа double с названием mas_double такого размера,
//        // который пользователь вводит с клавиатуры. Заполнить mas_double рандомными числами,
//        // используя Math.Random() и вывести его. После каждый чётный элемент mas_double возвести в квадрат.
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое положительное число для определения длинны массива");
//
//        double mas_double[] = new double[scanner.nextInt()];
//
//        System.out.println("вывод первоначального  массива ");
//        for (int i =0; i< mas_double.length; i++) {
//            mas_double[i] = Math.random();
//            System.out.println(mas_double[i]);
//            if (i % 2 ==1) {
//                mas_double[i] = Math.pow(mas_double[i],2);
//            }
//        }
//
//
//        //Вывести массив в прямом и обратном порядке.
//        System.out.println("вывод массива в прямом порядке");
//        for (int i =0; i<mas_double.length; i++) {
//            System.out.println(mas_double[i]);
//        }
//
//        System.out.println("вывод массива в обратном порядке");
//        for (int i = mas_double.length - 1; i>=0; i--) {
//            System.out.println(mas_double[i]);
//        }

        int arrayInt2[] = {2,4,5,6,7,8};

        for ( int number: arrayInt2)
        {
            System.out.println(number);
        }


        System.out.println(Arrays.toString(arrayInt2)); // Вывод в виде строки
        System.out.println(Arrays.binarySearch(arrayInt2, 2)); // поиск индекса по элементу
        Arrays.sort(arrayInt2); // сортировка






    }
}
