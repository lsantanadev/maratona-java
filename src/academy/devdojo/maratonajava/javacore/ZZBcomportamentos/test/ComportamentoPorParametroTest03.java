package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static final List<Car> CARS = List.of(new Car("green", 2012), new Car("red", 2012), new Car("blue", 1998));

    static void main() {
        System.out.println(filter(CARS, car -> car.getColor().equals("red")));
        System.out.println(filter(CARS, car -> car.getColor().equals("blue")));
        System.out.println(filter(CARS, car -> car.getColor().equals("green")));

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }
}
