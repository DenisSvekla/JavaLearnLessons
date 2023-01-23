package Lessons.lesson31patterns2.Builder;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword.Builder().setColor("Black").setVladelec("Anton").setDlina(4).build();
    }
}
