package academy.devdojo.maratonajava.javacore.Ycollections.dominio.List;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "ID não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga manga) {
        // negativo se o this < manga
        // se this == manga, return 0
        // positivo se this > manga

        // Para trabalhar com tipos primitivos:
//        if (this.id < manga.getId()){
//            return -1;
//        } else if (this.id.equals(manga.getId())){
//            return 0;
//        } else {
//            return 1;
//        }

        // Para classes wrappers:
//        return this.nome.compareTo(manga.getNome());
//        return Double.compare(preco, manga.getPreco());
//        return Double.valueOf(preco).compareTo(manga.getPreco());

        return this.id.compareTo(manga.getId());
    }
}
