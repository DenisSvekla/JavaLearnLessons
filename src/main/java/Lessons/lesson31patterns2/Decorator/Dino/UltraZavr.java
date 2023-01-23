package Lessons.lesson31patterns2.Decorator.Dino;

public class UltraZavr extends DinoDecorator{
    public UltraZavr(IDinosaur iDinosaur) {
        super(iDinosaur);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("ULTRA ROAR!!!!!!");
    }
}
