package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");

        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("Italia: "+df.format(calendar.getTime()));
    }
}
