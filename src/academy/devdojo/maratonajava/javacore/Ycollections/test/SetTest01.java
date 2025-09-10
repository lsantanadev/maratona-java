package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2));
        mangas.add(new Manga(1L, "Pokemon", 5.85));
        mangas.add(new Manga(2L, "Attack on titan", 12.1));
        mangas.add(new Manga(3L, "Naruto", 20.5));


        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
