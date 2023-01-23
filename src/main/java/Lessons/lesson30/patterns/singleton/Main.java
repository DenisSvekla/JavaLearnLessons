package Lessons.lesson30.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        City c1 = City.getInstance("Minsk");
        City c2 = City.getInstance("Grodno");
        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
