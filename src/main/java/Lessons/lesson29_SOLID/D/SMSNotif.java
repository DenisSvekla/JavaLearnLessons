package Lessons.lesson29_SOLID.D;

import Lessons.lesson29_SOLID.SingleResponsibilityAndOpenClosed.mod4.INotifications;

public class SMSNotif implements INotificationsss {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем через смс");
    }
}
