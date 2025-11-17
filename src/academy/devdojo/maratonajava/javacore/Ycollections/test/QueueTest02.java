package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2));
        mangas.add(new Manga(1L, "Pokemon", 5.85));
        mangas.add(new Manga(2L, "Attack on titan", 12.1));
        mangas.add(new Manga(3L, "Naruto", 20.5));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
