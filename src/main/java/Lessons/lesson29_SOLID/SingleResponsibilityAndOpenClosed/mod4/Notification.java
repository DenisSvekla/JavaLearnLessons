package Lessons.lesson29_SOLID.SingleResponsibilityAndOpenClosed.mod4;

public class Notification {
    public void emailNotification (String type, String text) {
        switch (type) {
            case "sms" :
                //логика по отправлению смс
                break;
            case "email":
                // логика по отправлению письма
                break;
            default:
                // не отправляй

        }

    }

}
