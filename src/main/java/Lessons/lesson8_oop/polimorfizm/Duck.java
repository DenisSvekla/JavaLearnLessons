package Lessons.lesson8_oop.polimorfizm;

public class Duck extends Animal {
    private String color;

    @Override
    public void showInfo () {
        System.out.println(getAge() +" " + getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
