package Lessons.lesson31patterns2.Decorator.Developer;

public class Main {
    public static void main(String[] args) {
        IDeveloper developer = new JuniorDeveloper();
        IDeveloper md = new MiddleDeveloper(developer);
        IDeveloper ld = new LeadDeveloper(md);
        ld.writeCode();
    }
}
