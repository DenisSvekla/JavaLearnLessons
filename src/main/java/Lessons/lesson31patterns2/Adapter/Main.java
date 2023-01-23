package Lessons.lesson31patterns2.Adapter;

public class Main {
    public static void main(String[] args) {
        ISender sender = new TelegaSender();
        sender.send("Hello world!!!");
    }
}
