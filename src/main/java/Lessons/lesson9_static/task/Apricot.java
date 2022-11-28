package Lessons.lesson9_static.task;

public class Apricot extends Fruit {
    private final int COST_APRICOT = 50;
    public static int allApricots;
    public static double allCostsApricot;

    public Apricot(double weight) {
        super(weight);
        allApricots++;
        allCostsApricot = allCostsApricot + this.fruitCost();
    }

    @Override
    double fruitCost() {
        return this.getWeight() * COST_APRICOT;
    }
}
