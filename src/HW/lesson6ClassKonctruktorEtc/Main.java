package HW.lesson6ClassKonctruktorEtc;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCardForDenis = new CreditCard(1234567, 40000);
        CreditCard creditCardForIhor = new CreditCard(14543, 70000);
        CreditCard creditCardForGena = new CreditCard(445544, 100);

        creditCardForDenis.plusSum(60000);
        creditCardForIhor.plusSum(10000);
        creditCardForGena.minusSum(110);

        creditCardForDenis.getAllInfo();
        creditCardForIhor.getAllInfo();
        creditCardForGena.getAllInfo();
    }
}
