package lesson6Class_Konstructor_Metods;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Запускаю метод getMyName");
//        System.out.println(getName("Denis", 28));
//        printMyBook("Any name");
//        int[] masiveInt = new int[10];
//        getFullMassive(masiveInt);
//        System.out.println(Arrays.toString(masiveInt));
//
//    }
//
//    public static String getName(String name, int age) {
//        return "My name is " + name + ", my age is " + age;
//    }
//
//    public static void printMyBook(String bookName) {
//        System.out.println("Plz print my book " + bookName);
//    }
//
//    //Создать метод который будет на вход принимать пустой int массив
//    // а на выходе отдавать заполненный случайными значениями
//
//    public static int[] getFullMassive(int[] massiveInt) {
//        Random random = new Random();
//        for (int i = 0; i < massiveInt.length; i++) {
//            massiveInt[i] = random.nextInt(100);
//        }
//        return massiveInt;

        Calculator calculator = new Calculator(1);
        Calculator calculator1 = new Calculator(100.0,"Black");
        calculator1.getAllInfo();
        calculator.getAllInfo();

   }
}