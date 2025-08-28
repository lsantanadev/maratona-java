package academy.devdojo.maratonajava.javacore.Ycollections.test.List;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.List.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCHK", "iPhone");
        Smartphone s2 = new Smartphone("133CHK", "Samsung");
        Smartphone s3 = new Smartphone("333333", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("ssssss", "Motorola");

        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4);

        if (indexSmartphone4 != -1) {
            System.out.println(smartphones.get(indexSmartphone4));
        }

    }
}
