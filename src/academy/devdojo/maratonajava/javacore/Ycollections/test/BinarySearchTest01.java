package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(11);
        numeros.add(38);
        numeros.add(88);
        numeros.add(19);
        numeros.add(33);
        numeros.add(55);
        numeros.add(99);
        numeros.add(44);

        Collections.sort(numeros);
        System.out.println(numeros);
        int index = Collections.binarySearch(numeros, 38);
        System.out.println(index);
    }
}
