package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        final Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneTokyo = java.time.ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();

        final ZonedDateTime zonedDateTime = now.atZone(zoneTokyo);
        System.out.println(zonedDateTime);

        Instant nowIntant = Instant.now();
        System.out.println(nowIntant);
        final ZonedDateTime zonedDateTime2 = nowIntant.atZone(zoneTokyo);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        final OffsetDateTime offsetDateTime1 = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime1);
        final OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime2);

        final OffsetDateTime offsetDateTime3 = nowIntant.atOffset(offSetManaus);
        System.out.println(offsetDateTime3);

        final JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2,1);
        final JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);

    }
}
