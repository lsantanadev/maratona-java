package academy.devdojo.maratonajava.javacore.Zgenerics.exercicio.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.exercicio.service.Repositorio;

import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro("Celta");
        Carro c3 = new Carro("Uno");
        Carro c4 = new Carro("Onix");
        Carro c5 = new Carro("T-cross");
        Repositorio<Carro> repositorio = new Repositorio<>();

        repositorio.adicionar(c1);
        repositorio.adicionar(c2);
        repositorio.adicionar(c3);
        repositorio.adicionar(c4);
        repositorio.adicionar(c5);

        repositorio.obterDados();

        System.out.println("-----------");

        repositorio.remover(c3);

        System.out.println("------------");

        repositorio.buscarPorIndice(2);

    }
}
