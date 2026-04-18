package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2012), new Car("red", 2012), new Car("blue", 1998));

    static void main() {
        System.out.println(filteredCarsByColor(cars, "red"));
        System.out.println("----");
        System.out.println(filteredCarsByYear(cars, 2010));
    }

    private static List<Car> filteredCarsByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static List<Car> filteredCarsByYear(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
