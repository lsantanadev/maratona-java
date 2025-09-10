package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone t1, Smartphone t2) {
        return t1.getMarca().compareTo(t2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga t1, Manga t2) {
        return Double.compare(t1.getPreco(), t2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("15256", "Nokia");
        set.add(smartphone);

        //Organiza com base no Comparable
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(4L, "Hunter x Hunter", 19.2));
        mangas.add(new Manga(1L, "Pokemon", 5.85));
        mangas.add(new Manga(2L, "Attack on titan", 12.1));
        mangas.add(new Manga(3L, "Naruto", 20.5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------");

        Manga jujutsuKaisen = new Manga(22L, "Jujutsu Kaisen", 12.1);

        System.out.println(mangas.lower(jujutsuKaisen));
        System.out.println(mangas.floor(jujutsuKaisen));
        System.out.println(mangas.higher(jujutsuKaisen));
        System.out.println(mangas.ceiling(jujutsuKaisen));

        System.out.println("--------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
