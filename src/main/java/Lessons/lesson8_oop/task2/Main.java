package Lessons.lesson8_oop.task2;
//Реализовать иерархию, показанную ниже,  переопределить методы drow и erase в каждом из классов так,
// чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса .
// Показать работу каждого из методов в main другого класса.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.drow();
        triangle.erase();
        Square Square = new Square();
        Square.drow();
        Square.erase();
        Circle circle = new Circle();
        circle.drow();
        circle.erase();
    }


}
