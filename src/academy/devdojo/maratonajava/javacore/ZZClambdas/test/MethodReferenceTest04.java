package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    static void main() {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("One piece", 1110),
                new Anime("Naruto", 500),
                new Anime("Attack on titan", 90)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episode) -> new Anime(title, episode);

        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;

        System.out.println(animeBiFunction1.apply("HunterxHunter", 189));

    }
}
