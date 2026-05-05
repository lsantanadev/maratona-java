package academy.devdojo.maratonajava.javacore.ZZDoptionals.test;

import academy.devdojo.maratonajava.javacore.ZZDoptionals.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptionals.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main() {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Hunter x Hunter");
        mangaByTitle.ifPresent(m -> m.setTitle("Hunter x Hunter 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Pokemon")
                .orElse(new Manga(3, "Pokemon", 500));
        System.out.println(newManga);
    }
}
