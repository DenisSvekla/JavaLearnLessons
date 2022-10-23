package Lessons.lesson9_static.task;

public abstract class Fruit {
    private double weight;
    public static int allFruits = 0;
    public static double allCostsFruits = 0;

    public Fruit(double weight) {
        this.weight = weight;
        allFruits++;
        Fruit.allCostsFruits += Apple.allCostsApples + Pear.allCostsPears + Apricot.allCostsApricot;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract double fruitCost();
}

