package Lessons.lesson13CollectionsAndGEneri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Mai {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.add("Hello");
//        arrayList.add("1234");
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(1));// достает элемент
//        arrayList.add(1,"NEw"); // добавляет новый по индеку и остальные значения с лева смещает
//        System.out.println(arrayList);
//        arrayList.remove(0); // удаляет
//        arrayList.contains("1234"); //  проверяет есть ли такой элемент
//        arrayList.set(1,"34"); // заменяет в указанном индексе
//        arrayList.indexOf("34");// возвращает первый элемент, который мы ищем. Если есть несколько элементов, вохвращает индекс только первого
//        arrayList.clear();// очищает всю коллекцию
//        arrayList.size(); // показыает сколько элементов лежит в коллекции
//        System.out.println(arrayList);
//        arrayList.isEmpty(); // проверяет пустая коллекция или нет
//        arrayList.toArray(); //преобразовывает коллекцию в массив

        // LinkedList

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1234);
        numbers.add(1444);
        numbers.add(31234);
        numbers.addFirst(31234);
        numbers.addLast(31234);
        numbers.removeFirst();
        numbers.removeLast();
        numbers.getFirst();
        numbers.getLast();




    }
}
