package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        final LocalDateTime ldt1 = date.atTime(time);
        final LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
