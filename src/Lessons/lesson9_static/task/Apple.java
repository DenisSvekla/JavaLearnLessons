package Lessons.lesson9_static.task;

public class Apple extends Fruit {
    private final int COST_APPLE = 60;
    public static int allApples;
    public static double allCostsApples;

    public Apple(double weight) {
        super(weight);
        allApples++;
        allCostsApples = allCostsApples + this.fruitCost();
    }

    @Override
    double fruitCost() {
        return this.getWeight() * COST_APPLE;
    }
}