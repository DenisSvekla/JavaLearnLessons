package HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson5_massive {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] massForHw = new int[4][4];


        System.out.println("*** Задание 1 *** ");
        for (int i = 0; i <massForHw.length;i++){
            for (int j =0; j< massForHw[i].length;j++) {
                massForHw[i][j] = random.nextInt(50);
                System.out.println("Введи целое число, которое будет добавлено в массив");
                massForHw[i][j] += scanner.nextInt();
                System.out.print(Arrays.deepToString(massForHw));
            }
        }
        System.out.print(Arrays.deepToString(massForHw));

        System.out.println("*** Задание 2 *** ");
        String[][] chessMass = new String[8][8];
        for (int i = 0; i < chessMass.length; i++) {
            for (int j = 0; j < chessMass[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0)||(i % 2 == 1 && j % 2 == 1) ) {
                    chessMass[i][j] = "W";
                    System.out.print(chessMass[i][j] + " ");
                } else if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    chessMass[i][j] = "B";
                    System.out.print(chessMass[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
