package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByNameComparator mangaByNameComparator = new MangaByNameComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2));
        mangas.add(new Manga(1L, "Pokemon", 5.85));
        mangas.add(new Manga(2L, "Attack on titan", 12.1));
        mangas.add(new Manga(3L, "Naruto", 20.5));

        // Collections.sort(mangas); Por ID
        mangas.sort(mangaByNameComparator); // Por nome

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Attack on titan", 12.1);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByNameComparator));

    }
}
