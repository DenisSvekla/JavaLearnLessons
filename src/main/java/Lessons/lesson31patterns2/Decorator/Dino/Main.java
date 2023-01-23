package Lessons.lesson31patterns2.Decorator.Dino;

public class Main {
    public static void main(String[] args) {
        IDinosaur dinosaur = new SimpleDinosaur();
        dinosaur.eat();
        dinosaur.voice();

        System.out.println("--------------");

        IDinosaur dinosaur2 = new SuperDinosaur(new SimpleDinosaur());
        dinosaur2.eat();
        dinosaur2.voice();

        System.out.println("--------------");

        IDinosaur dinosaur3 = new UltraZavr(new SuperDinosaur(new SimpleDinosaur()));
        dinosaur3.eat();
        dinosaur3.voice();

    }
}
