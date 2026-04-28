package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    static void main() {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("One piece", 1110),
                new Anime("Naruto", 500),
                new Anime("Attack on titan", 90)));

        animeList.sort(AnimeComparators::compareByEpisodes);
        animeList.sort(AnimeComparators::compareByTitle);

        System.out.println(animeList);
    }
}
