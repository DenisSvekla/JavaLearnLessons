package Lessons.Lesson14.workWithDare;

import java.time.Clock;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Date date = new Date();
//        date.setTime(1000); // задается в милисекундах и добавляетс с 1 января 1970
//
//        Date date1 = new Date();
//        date1.setTime(2000);
//
//        System.out.println(date.after(date1));
//        System.out.println(date.before(date1));
//        System.out.println(date1.getTime());
        LocalDate localDate = LocalDate.of(1996,2,23);

        System.out.println(LocalDate.now());
        System.out.println(localDate.plusYears(1));
        System.out.println(localDate.minusDays(123));
        System.out.println(localDate.isBefore(LocalDate.now()));
        System.out.println(localDate.isAfter(LocalDate.now()));
        System.out.println(LocalDate.now().getDayOfWeek());


    }
}
