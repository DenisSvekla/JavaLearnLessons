package Lessons.lesson13CollectionsAndGEneri;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetLessons {
    public static void main(String[] args) {

        //Set имеет три реализации. Хранит уникальные элементы

        //TreeSet упорядочивает элементы в порядке возврастания стринг по алфавиту

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(544);
        treeSet.add(123);
        treeSet.add(1);
        System.out.println(treeSet);

        //LinkedHasSet - хранить в порядке добавления

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("good");
        linkedHashSet.add("Nice");
        linkedHashSet.add("free time");
        System.out.println(linkedHashSet);

        //HashSet - для быстрого поиска через хеш
        HashSet<God> hashSet = new HashSet<>();
        God god = new God();
        hashSet.add(god);
        System.out.println(hashSet);
    }
}
