package Lessons.Lesson14.workWithLamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainForLAmbda {
    public static void main(String[] args) {
        InterfaceMyFunIt lambda = (x,y) -> (x+y);
        System.out.println(lambda.sum(10,2));

        //базовые лямбды
        Predicate<String> ddd = (x) -> (x.equals("Hello"));
    }
}
