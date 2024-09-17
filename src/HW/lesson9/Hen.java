package HW.lesson9;

public abstract class Hen {

    private int age;
    public static int commonEggsInMonth;

    public Hen(int age) {
        this.age = age;
        commonEggsInMonth += getCountOfEggsPerMonth();
    }

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я курица ";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
