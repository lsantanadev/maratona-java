package academy.devdojo.maratonajava.javacore.Ycollections.test.List;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.List.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hunter x Hunter");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Naruto");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        new Manga(null, null, 0.0);
    }
}
