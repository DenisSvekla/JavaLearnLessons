package HW.lesson7;

public class Cow extends Animal implements AnimalAction{

    public Cow(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Корова по имени " + getName() + " с возрастом " + getAge() + " ест травку");
    }
}
