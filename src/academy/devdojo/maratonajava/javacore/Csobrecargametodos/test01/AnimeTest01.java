package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test01;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Shonen", 650);
        anime.init("Naruto", "Shonen", 650, "Aventura");
        anime.imprime();
    }
}
