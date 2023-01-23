package Lessons.lesson30.patterns.singleton;

public final class City {
    private static City instance;
    public String name;

    private City(String name) {
        this.name = name;
    }

    public static City getInstance(String value) {
        if (instance == null) {
            instance = new City(value);
        }
        return instance;
    }
}
