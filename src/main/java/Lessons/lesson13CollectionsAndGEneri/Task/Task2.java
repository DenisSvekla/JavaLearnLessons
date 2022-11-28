package Lessons.lesson13CollectionsAndGEneri.Task;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("USA");
        list.addFirst("LTV");
        list.addLast("BLR");
        list.addLast("GER");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
