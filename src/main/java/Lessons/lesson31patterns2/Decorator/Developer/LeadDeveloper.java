package Lessons.lesson31patterns2.Decorator.Developer;

public class LeadDeveloper extends DeveloperDecorator{

    public LeadDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("И неплохо руковожу!");
    }
}
