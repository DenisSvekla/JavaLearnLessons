package Lessons.lesson31patterns2.Adapter;

public class Adapter extends SmsNotification implements ISender {

    @Override
    public void send(String text) {
        sendSMS(text);
    }
}


//public class Adapter implements ISender{
//    SmsNotification smsNotification = new SmsNotification();
//
//    @Override
//    public void send(String text) {
//        smsNotification.sendSMS(text);
//    }
//}
