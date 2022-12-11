package Lessons.lesson20PotokiJava.Task.potokCheck;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Я запустил главный поток в маин классе");

        Dogs dogs = new Dogs();
        dogs.start();
        dogs.join();


    }
}
