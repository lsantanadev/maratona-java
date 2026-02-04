package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2, 0));
        mangas.add(new Manga(1L, "Pokemon", 5.85, 5));
        mangas.add(new Manga(2L, "Attack on titan", 12.1, 2));
        mangas.add(new Manga(3L, "Naruto", 20.5,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
