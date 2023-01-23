package Lessons.lesson31patterns2.Singleton;

public class Main {
    public static void main(String[] args) {
        City city = City.creator("Minsk");
        City city1 = City.creator("Grodno");

        System.out.println(city.name);
        System.out.println(city1.name);
    }
}