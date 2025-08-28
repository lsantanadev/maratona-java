package academy.devdojo.maratonajava.javacore.Ycollections.test.List;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.List.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCHK", "iPhone");
        Smartphone s2 = new Smartphone("1ABCHK", "iPhone");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
