package lesson5_massive2_and_n;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] check = new int[4];
        int checdk[][] = new int[4][5];
        System.out.println(checdk.length);

        //Задание:
        //Создайте двухмерный массив и заполните его псевдослучайными числами с помощью класса Random
        int [][] newMass = new int[8][8];
        Random random = new Random();

        int maxValue = newMass[0][0];

        int indexFirst = 0;
        int indexSecond = 0;

        for (int i = 0; i< newMass.length; i++) {
            for (int j = 0; j<newMass[i].length; j++) {
                newMass[i][j] = random.nextInt(50);
                System.out.print(newMass[i][j] + " ");
                if (newMass[i][j] >= maxValue) {
                    maxValue = newMass[i][j];
                    indexFirst = i;
                    indexSecond = j;
                }
            }
            System.out.println();
        }
        System.out.println("Первый индекс " + indexFirst);
        System.out.println("второй индекс " + indexSecond);
        System.out.println("Максимальное значение " + maxValue);
        newMass[indexFirst][indexSecond] = 777;

        System.out.println(Arrays.deepToString(newMass));



        int sumValue = 0;
        int sumValue2=0;

        for (int i = 0; i<newMass.length; i++) {
            sumValue = sumValue + newMass[i][i];
        }

        for (int i = newMass.length - 1; i>=0; i-- ) {
            sumValue2 = sumValue2 + newMass[i][i];
        }


        System.out.println("Сумма значений на главной диагонали  " + sumValue );
        System.out.println("Сумма значений на побочной диагонали " + sumValue2);

        //Задание:
        //Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.
        int count = 0;

        int[][][][] nMass =  {{{{4,5,6},{5,6,7,8,9,0},{11,12},{13}}}};

        for (int i =0; i <= nMass[0][0][0].length; i++) {
           count = count + nMass[0][0][i].length;
        }
        System.out.println(count);

    }
}
