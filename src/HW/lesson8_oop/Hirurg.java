package HW.lesson8_oop;

public class Hirurg extends Doctor {

    private String kakBudutLechit= "Операционного ножа";

    @Override
    public void lechenie() {
        super.lechenie();
        System.out.print(kakBudutLechit);
    }
}
