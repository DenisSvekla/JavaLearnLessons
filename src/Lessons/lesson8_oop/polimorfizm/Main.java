package Lessons.lesson8_oop.polimorfizm;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setColor("Red");
        duck.setAge(3);
        duck.showInfo();
        Animal animal = new Animal();
        animal.showInfo();
    }
}
