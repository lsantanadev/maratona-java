package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {

    public String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
