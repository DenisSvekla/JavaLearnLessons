package Lessons.lesson20PotokiJava.task4Potoks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток Main запустился");
        for (int i =0;i<4;i++) {
            PotoksWithDigits potoksWithDigits = new PotoksWithDigits();
            potoksWithDigits.start(potoksWithDigits).join();

        }

        synchronized (new PotoksWithDigits()) {

        }
        System.out.println("End");



    }
}
