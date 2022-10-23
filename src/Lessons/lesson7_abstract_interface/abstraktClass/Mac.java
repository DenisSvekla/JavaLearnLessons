package Lessons.lesson7_abstract_interface.abstraktClass;

public class Mac extends Computer {
    @Override
    void getClassName() {
        System.out.println("I'm " + getClass().getSimpleName());
    }
}
