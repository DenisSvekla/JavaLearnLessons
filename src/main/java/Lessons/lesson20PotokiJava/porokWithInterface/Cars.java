package Lessons.lesson20PotokiJava.porokWithInterface;

public class Cars implements Runnable{
    @Override
    public void run() {

        System.out.println("asdasd");

    }

   public void  fff (Object car) {
       Thread thread = new Thread((Runnable) car);
       thread.start();
   }
}
