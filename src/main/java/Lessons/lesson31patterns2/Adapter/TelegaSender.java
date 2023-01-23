package Lessons.lesson31patterns2.Adapter;

public class TelegaSender implements ISender{
    @Override
    public void send(String text) {
        System.out.println("Посылаем сообщение в телегу:");
        System.out.println(text);
    }
}
