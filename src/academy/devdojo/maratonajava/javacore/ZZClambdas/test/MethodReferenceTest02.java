package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    static void main() {
        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("One piece", 1110),
                new Anime("Naruto", 500),
                new Anime("Attack on titan", 90)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
