package Lessons.lesson6Class_Konstructor_Metods;

public class Calculator {
    double weight;
    int cost;
    String color;

    public Calculator () {

    }

    public Calculator(double weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public Calculator(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Calculator(int cost) {
        this.cost = cost;
    }
    {
        System.out.println("Создается калькулятор");
    }

    int summ (int a, int b) {
        int c = a + b;
        return c;
    }

    int minus (int a, int b) {
        int c = a - b;
        return c;
    }

    int multiplication (int a, int b) {
        int c = a * b;
        return c;
    }

    int division (int a, int b) {
        int c = a / b;
        return c;
    }
    void getAllInfo (){
        System.out.println("Цвет " + color + "Вес "+ weight + "Цена " + cost);
    }
}
