package Lessons.lesson20PotokiJava;

public class Main {
    public static void main(String[] args) {
        System.out.println("parent tread");

        Car car = new Car();
        car.start();
        System.out.println("End");
    }
}
