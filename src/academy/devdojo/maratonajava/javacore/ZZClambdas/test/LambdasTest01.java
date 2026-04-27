package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    static void main() {
        List<String> strings = List.of("Leonardo", "Daniela", "Livia");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        forEach(strings, n -> System.out.println(n));
        forEach(integers, n -> System.out.println(n));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
