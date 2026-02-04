package academy.devdojo.maratonajava.javacore.Rdates.date;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1256325632563L); // milisegundos
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);
    }
}
