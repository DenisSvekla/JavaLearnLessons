package lesson8_oop;

public class Next {
    private int age;
    private String name;
    private double weight;

    public void showInfo() {
        System.out.println(age + " " + name + " " + weight);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
