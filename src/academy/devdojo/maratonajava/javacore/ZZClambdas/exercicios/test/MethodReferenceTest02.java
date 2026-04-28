package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain.Format;

import java.time.LocalDate;
import java.util.function.Function;

public class MethodReferenceTest02 {
    static void main() {
        Format format = new Format();

        Function<LocalDate, String> dateFormat = format::formatDate;

        System.out.println(dateFormat.apply(LocalDate.ofYearDay(2026, 2)));
    }
}
