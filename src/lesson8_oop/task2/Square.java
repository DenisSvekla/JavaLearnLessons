package lesson8_oop.task2;

public class Square extends Shape {

    @Override
    public void drow() {
        System.out.println("I draw " + getClass().getSimpleName());
    }

    @Override
    public void erase() {
        System.out.println("I erase " + getClass().getSimpleName());
    }
}
