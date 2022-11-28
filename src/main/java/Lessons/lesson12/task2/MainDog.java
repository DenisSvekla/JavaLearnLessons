package Lessons.lesson12.task2;

import java.io.*;

public class MainDog {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("Bob", 5, "Laika");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C://Task.txt"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C://Task.txt"));
        Dog oldDog = (Dog) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(oldDog.age);
        System.out.println(oldDog.name);
        System.out.println(oldDog.poroda);
    }
}
