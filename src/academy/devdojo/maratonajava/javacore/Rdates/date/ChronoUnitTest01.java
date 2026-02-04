package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1998, Month.JULY, 24, 15,0,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now)+ " dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now)+ " semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now)+ " meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now)+ " anos");
    }
}
