package Lessons.lesson9_static.task;

public class Pear extends Fruit {
    private final int COST_PEAR = 70;
    public static int allPears;
    public static double allCostsPears;

    public Pear(double weight) {
        super(weight);
        allPears++;
        allCostsPears = allCostsPears + this.fruitCost();
    }

    @Override
    double fruitCost() {
        return this.getWeight() * COST_PEAR;
    }
}
