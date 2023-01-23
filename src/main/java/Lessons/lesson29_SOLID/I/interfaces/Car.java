package Lessons.lesson29_SOLID.I.interfaces;

public class Car implements Vehicle, MOveble{


    public Car() {
        super();
    }

    @Override
    public int getCost() {
        return 100_000_000;
    }


    @Override
    public String getColor() {
        return "red";
    }


    @Override
    public void getBrand() {

    }

    @Override
    public void start() {

    }

    @Override
    public void end() {

    }
}

