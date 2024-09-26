package HW.Lesson14DateAndLambda;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************Задание 1***************");
        Predicate<String> checkSomeWord = (x) -> {
            boolean allWordIsCorrect = false;
            char checkFirst = x.charAt(0);
            char checkLast = x.charAt(x.length() - 1);
            if (checkFirst == 'J' || checkFirst == 'N') {
                if (checkLast == 'A') {
                    allWordIsCorrect = true;
                }
            }
            return allWordIsCorrect;
        };

        System.out.println("Введите слово для проверки");
        System.out.println(checkSomeWord.test(scanner.nextLine()));

        System.out.println("***************Задание 2***************");
        Consumer<Box> writeMessageAboutBox = (x) -> {
            System.out.println("Отгузили ящик с весом " + x.getWeight());
        };

        Box box = new Box(123);
        writeMessageAboutBox.accept(box);


        System.out.println("***************Задание 3***************");
        Function<Integer, String> checkWhichDigits = (x) -> {
            String result=null;
            if(x>0) {
                result = "Положительное число";
            } else if(x<0) {
                result = "Отрицательное число";
            } else if (x==0) {
               result = "Ноль";
            }
            return result;
        };

        System.out.println(checkWhichDigits.apply(-1));

        System.out.println("***************Задание 4***************");
        Supplier<Integer> randomDigits = () -> {
            Random random = new Random();
            int randomInt = random.nextInt(10);
            return randomInt;
        };

        System.out.println(randomDigits.get());
    }
}
