package Lessons.lesson12;

import Lessons.lesson12.Plain;

import java.io.*;

public class MainPlain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Plain plain = new Plain(80,2, "Roger");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C://test.txt"));
        objectOutputStream.writeObject(plain);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream("C://test.txt")));
        Plain plainRestored = (Plain) objectInputStream.readObject();
        objectInputStream.close();
    }
}
