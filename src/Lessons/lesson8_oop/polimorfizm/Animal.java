package Lessons.lesson8_oop.polimorfizm;

public class Animal {
    private int age;

    public void showInfo () {
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
