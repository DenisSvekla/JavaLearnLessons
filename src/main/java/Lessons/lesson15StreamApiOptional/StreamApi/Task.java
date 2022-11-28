package Lessons.lesson15StreamApiOptional.StreamApi;

import java.util.ArrayList;

public class Task {
    //Создать коллекцию класса ArrayList наполнить ее рандомными элементами типа Integer.
    //С помощью Stream'ов:
    //- Удалить дубликаты
    //- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
    //- Каждый элемент умножить на 2
    //- Отсортировать и вывести на экран первых 4 элемента

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(12);
        numbers.add(11);
        numbers.add(11);
        numbers.add(12);
        numbers.add(8);
        numbers.add(8);
        numbers.add(1122);
        numbers.add(1122);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);

        numbers.stream().distinct().filter(x-> (x%2==0)&&(x<=17) && (x>=7)).map(x-> x*2).sorted().limit(4).forEach(System.out::println);
    }
}
