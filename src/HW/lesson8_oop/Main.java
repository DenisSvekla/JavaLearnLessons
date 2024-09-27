package HW.lesson8_oop;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient(2);
        Terapevt terapevt = new Terapevt();
        Doctor doctorForPacient = terapevt.naznachenieVracha(pacient);
        doctorForPacient.lechenie();
    }
}
