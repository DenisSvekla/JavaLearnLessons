package HW.lesson8_oop;

public class Dantist extends Doctor {

    private String kakBudutLechit= "бормашины";

    @Override
    public void lechenie() {
        super.lechenie();
        System.out.print(kakBudutLechit);
    }
}
