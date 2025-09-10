package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2));
        mangas.add(new Manga(1L, "Pokemon", 5.85));
        mangas.add(new Manga(2L, "Attack on titan", 12.1));
        mangas.add(new Manga(3L, "Naruto", 20.5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------- Usando Comparable por ID---------");
        Collections.sort(mangas); // depois de implementar Comparable

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------- Usando Comparator por nome---------");
        Collections.sort(mangas, new MangaByNameComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
