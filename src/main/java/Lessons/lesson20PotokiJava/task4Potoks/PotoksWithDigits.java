package Lessons.lesson20PotokiJava.task4Potoks;

public class PotoksWithDigits implements Runnable{

    @Override
    public void run() {
        System.out.println("Поток запущен класса" + getClass().getName());
        for (int i=0;i<100;i++) {
            System.out.println(i);
        }
        System.out.println("Поток класса остановлен" + getClass().getName());
    }


    public Thread start (Object potoks) {
        Thread thread = new Thread((Runnable) potoks);
        thread.start();
        return thread;
    }
}
