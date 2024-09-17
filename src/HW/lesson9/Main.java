package HW.lesson9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        BelarusianHen belarusianHen = new BelarusianHen(1);
        RussianHen russianHen = new RussianHen(2);
        MoldovanHen moldovanHen = new MoldovanHen(3);
        UkrainianHen ukrainianHen = new UkrainianHen(4);

        Hen[] hens = new Hen[100];
        hens[0] = belarusianHen;
        hens[1] = ukrainianHen;
        hens[2] = moldovanHen;
        hens[3] = russianHen;

        for (int i = 4; i < hens.length; i++) {
            int anyHens = random.nextInt(4);
            int anyAge = random.nextInt(4);
            if (anyHens == 0) {
                hens[i] = new RussianHen(anyAge);
            } else if (anyHens == 1) {
                hens[i] = new BelarusianHen(anyAge);
            } else if (anyHens == 2) {
                hens[i] = new MoldovanHen(anyAge);
            } else if (anyHens == 3) {
                hens[i] = new UkrainianHen(anyAge);
            }
        }

        System.out.println(belarusianHen.getDescription());
        System.out.println(russianHen.getDescription());
        System.out.println(ukrainianHen.getDescription());
        System.out.println(moldovanHen.getDescription());
        System.out.println("Общее количество снесенных яиц за год " + (Hen.commonEggsInMonth * 12));
    }
}
