package HW.lesson7;

public class Tiger extends Animal implements AnimalAction{

    public Tiger(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Тигр по имени " + getName() + " с возрастом " + getAge() + " ест корову");
    }
}
