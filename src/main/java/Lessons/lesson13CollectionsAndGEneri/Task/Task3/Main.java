package Lessons.lesson13CollectionsAndGEneri.Task.Task3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person);
        hashSet.add(person2);
        for (Person e: hashSet) {
            System.out.println(e);
        }
        hashSet.remove(1);
        hashSet.remove(person2);
        System.out.println( hashSet.contains(person));
        HashSet<ArrayList<String>> hashSet1 = new HashSet<>();
    }
}
