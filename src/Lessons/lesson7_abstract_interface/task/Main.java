package Lessons.lesson7_abstract_interface.task;

public class Main {

    //Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
    // В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
    // В классе Main создать oбъекты Dog, Cat и вызвать метод doVoice().

    public static void main(String[] args) {
       new Dog().doVoice();
       new Cat().doVoice();

    }
}
