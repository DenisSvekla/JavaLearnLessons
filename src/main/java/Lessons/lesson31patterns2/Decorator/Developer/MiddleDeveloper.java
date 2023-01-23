package Lessons.lesson31patterns2.Decorator.Developer;

public class MiddleDeveloper extends DeveloperDecorator{

    public MiddleDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("И тестирую!!");
    }
}
