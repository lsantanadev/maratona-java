package academy.devdojo.maratonajava.javacore.Eblocosinicialização.dominio;

import java.util.Random;

public class Aluno {
    private String nome;
    private int matricula;

    {
        Random random = new Random();
        matricula = random.nextInt(9999);
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}
