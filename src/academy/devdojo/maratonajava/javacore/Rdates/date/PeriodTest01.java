package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        // Period não aceita LocalDateTime
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(10);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);

        // Period não faz a conversão de dias para meses - ChronoUnit resolve este problema
        System.out.println(p2.getMonths());
        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.MONTHS));

    }
}
