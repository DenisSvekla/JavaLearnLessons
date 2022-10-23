package Lessons.lesson7_abstract_interface.abstraktClass;

public class Hp extends Computer {
    @Override
    void getClassName() {
        System.out.println("I'm " + getClass().getSimpleName());

    }
}
