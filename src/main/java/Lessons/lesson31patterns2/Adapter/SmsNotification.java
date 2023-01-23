package Lessons.lesson31patterns2.Adapter;

public class SmsNotification {
    void sendSMS(String text){
        System.out.println("Я отправляю СМС, смотри:");
        System.out.println(text);
    }
}
