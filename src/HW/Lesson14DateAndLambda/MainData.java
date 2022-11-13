package HW.Lesson14DateAndLambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd-mm-yyyy и я Вам скажу, что был за день недели в этот день");
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(localDate.getDayOfWeek());

        System.out.println("И я тебе сейчас скажу, когда будет следующий вторник");
        localDate = localDate.plusDays(1);

        for(int i = 0; i<7; i++) {
            String dayOfWeek = localDate.getDayOfWeek().toString();
            if (dayOfWeek.equals("TUESDAY")){
                System.out.println("Следующий вторник будет " + localDate);
                break;
            }
            localDate = localDate.plusDays(1);
        }
    }
}
