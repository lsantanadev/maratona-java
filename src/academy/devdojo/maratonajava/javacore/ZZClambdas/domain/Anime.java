package academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
