package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Leonardo");
        Consumidor consumidor2 = new Consumidor("Daniela");

        Manga manga1 = new Manga(4L, "Hunter x Hunter", 19.2);
        Manga manga2 = new Manga(1L, "Pokemon", 5.85);
        Manga manga3 = new Manga(2L, "Attack on titan", 12.1);
        Manga manga4 = new Manga(3L, "Naruto", 20.5);

        List<Manga> consumidor1ListManga = List.of(manga1, manga2);
        List<Manga> consumidor2ListManga = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, consumidor1ListManga);
        consumidorMangaMap.put(consumidor2, consumidor2ListManga);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("-" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("--" + manga.getNome());
            }
        }
    }
}
