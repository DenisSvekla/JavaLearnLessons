package Lessons.lesson29_SOLID.D;

public class Main {
    public static void main(String[] args) {

        INotificationsss notif = new TelegramNotif();
        notif.sendMessage();
        // бронь
        notif.sendMessage();
        // отмена
        notif.sendMessage();
        // бронь
        notif.sendMessage();
        // перенос
        notif.sendMessage();
    }
}
