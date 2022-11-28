package Lessons.lesson12.task2;

import java.io.Serializable;

public class Dog implements Serializable {

    String name;
    int age;
    String poroda;

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }
}
