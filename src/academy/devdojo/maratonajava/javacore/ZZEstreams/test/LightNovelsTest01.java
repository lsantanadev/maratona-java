package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LightNovelsTest01 {
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99),
            new LightNovels("Overlord", 5.99),
            new LightNovels("Violet Evergarden", 2.99),
            new LightNovels("No game no life", 3.99),
            new LightNovels("Fullmetal alchemist", 6.99),
            new LightNovels("Kuno desuga", 1.99),
            new LightNovels("Konogatari", 8.99)
    ));

    static void main() {

        lightNovels.sort(Comparator.comparing(LightNovels::getTitle));
        List<String> titles = new ArrayList<>();

        for (LightNovels lightNovel : lightNovels) {

            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3) break;
        }


        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
