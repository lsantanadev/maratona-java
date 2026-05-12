package academy.devdojo.maratonajava.javacore.ZZDoptionals.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

class Estoque {
    private static final List<Produto> produtos = List.of(new Produto("notebook", 2599.00, "eletronico"), new Produto("caderno", 29.9, "papelaria"), new Produto("tenis", 299.9, "calçados"));

    public static Optional<Produto> buscarPorNome(String nome) {
        return buscarPor(p -> p.getNome().equals(nome));
    }

    public static Optional<Produto> buscarPor(Predicate<Produto> predicate) {
        Produto found = null;

        for (Produto produto : produtos) {
            if (predicate.test(produto)) {
                found = produto;
            }
        }

        return Optional.ofNullable(found);

    }
}

public class ExercicioTest01 {
    static void main() {
        Optional<Produto> busca = Estoque.buscarPorNome("notebook");
        busca.ifPresent(b -> b.setPreco(2699.00));
        busca.ifPresent(System.out::println);

        Optional<Produto> busca2 = Estoque.buscarPorNome("Celular");
        // busca2.orElseThrow(IllegalArgumentException::new);

        Produto produto = busca2.orElse(new Produto("Celular", 3999.99, "eletronico"));
        System.out.println(produto);

    }
}
