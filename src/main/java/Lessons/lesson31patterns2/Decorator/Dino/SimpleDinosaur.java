package Lessons.lesson31patterns2.Decorator.Dino;

public class SimpleDinosaur implements IDinosaur{
    @Override
    public void eat() {
        System.out.println("Я ем всё!");
    }

    @Override
    public void voice() {
        System.out.println("Я рычу по простому!");
    }
}
