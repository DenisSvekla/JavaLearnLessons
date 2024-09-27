package HW.lesson8_oop;

public class Pacient {

    private int planlechenia;

    public Pacient(int planlechenia) {
        this.planlechenia = planlechenia;
        System.out.println("К Вам пришел пациент, с назначенным планном лечения " + planlechenia);
    }

    public int getPlanlechenia() {
        return planlechenia;
    }
}
