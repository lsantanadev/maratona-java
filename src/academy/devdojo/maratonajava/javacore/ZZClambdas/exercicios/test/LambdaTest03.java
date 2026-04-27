package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest03 {
    static void main() {
        List<Double> value = List.of(100.0, 200.0, 300.0, 400.0);

        Function<Double, Double> brlToUsd = b -> b * 5;
        Function<Double, Double> usdToEur = u -> u * 0.9;

        Function<Double, Double> brlToEur = brlToUsd.andThen(usdToEur);

        List<Double> result = map(value, brlToEur);
        result.forEach(v -> System.out.printf("%.2f EUR%n", v));


    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
