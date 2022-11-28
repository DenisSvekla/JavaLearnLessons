package Lessons.lesson9_static.task;

public class Main {

        public static void main(String[] args) {
            Apple apple = new Apple(3.0);
            Apple apple2 = new Apple(1.0);
            Pear pear = new Pear(1.0);
            Pear pear2 = new Pear(1.0);
            Apricot apricot = new Apricot(2.0);
            Apricot apricot2 = new Apricot(2.0);

            System.out.println("Всего фруктов: " + Fruit.allFruits + ", всё стоит " + Fruit.allCostsFruits);
            System.out.println("Яблок: " + Apple.allApples + ", и стоят они " + Apple.allCostsApples);
            System.out.println("Груш: " + Pear.allPears + ", и стоят они " + Pear.allCostsPears);
            System.out.println("Абрикосов: " + Apricot.allApricots + ", и стоят они " + Apricot.allCostsApricot);
        }
    }