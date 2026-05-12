package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

public class LightNovels {
    private String title;
    private double price;

    public LightNovels(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovels{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
