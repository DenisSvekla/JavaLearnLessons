package Lessons.lesson20PotokiJava;

public class Car extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread1");
        System.out.println("Child thread2");
        System.out.println("Child thread3");
    }
}
