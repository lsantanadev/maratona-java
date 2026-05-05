package academy.devdojo.maratonajava.javacore.ZZDoptionals.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptionals.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Hunter x Hunter", 130), new Manga(2, "Attack on Titan", 90));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }

        return Optional.ofNullable(found);

    }


}
