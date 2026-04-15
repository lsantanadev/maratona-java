package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest01 {
    static void main() {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        // barcoList.sort((o1, o2) -> 0);

        //Classe anonima
        barcoList.sort(new Comparator<Barco>() {
                           @Override
                           public int compare(Barco o1, Barco o2) {
                               return o1.getNome().compareTo(o2.getNome());
                           }
                       });
                System.out.println(barcoList);
    }
}
