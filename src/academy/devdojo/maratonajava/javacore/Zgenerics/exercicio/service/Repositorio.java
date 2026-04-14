package academy.devdojo.maratonajava.javacore.Zgenerics.exercicio.service;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    List<T> itensGenericos;

    public Repositorio() {
        this.itensGenericos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Repositorio{" +
                "itensGenericos=" + itensGenericos +
                '}';
    }

    public void adicionar(T t) {
        itensGenericos.add(t);
    }

    public void remover(T t) {
        boolean removed = itensGenericos.removeIf(e -> e.equals(t));

        if (removed) {
            System.out.println("Item removido: " + t);
        } else {
            System.out.println("Nenhum item removido");
        }

        obterDados();
    }

    public void obterDados() {
        for (T itensGenerico : itensGenericos) {
            System.out.println(itensGenerico);
        }
    }

    public void buscarPorIndice(int i) {
        for (int j = 0; j < itensGenericos.size(); j++) {
            if (i == j) {
                System.out.println(itensGenericos.get(i));
            }
        }
    }


}
