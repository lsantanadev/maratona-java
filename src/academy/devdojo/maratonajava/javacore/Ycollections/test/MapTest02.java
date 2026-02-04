package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Leonardo");
        Consumidor consumidor2 = new Consumidor("Daniela");

        Manga manga1 = new Manga(4L, "Hunter x Hunter", 19.2);
        Manga manga2 = new Manga(1L, "Pokemon", 5.85);
        Manga manga3 = new Manga(2L, "Attack on titan", 12.1);
        Manga manga4 = new Manga(3L, "Naruto", 20.5);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga2);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
