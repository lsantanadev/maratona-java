package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCHK", "iPhone");
        Smartphone s2 = new Smartphone("1ABCHK", "iPhone");

        System.out.println(s1.equals(s2));
    }
}
