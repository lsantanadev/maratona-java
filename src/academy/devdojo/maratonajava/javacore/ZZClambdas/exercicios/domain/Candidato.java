package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain;

import java.util.function.Predicate;

public class Candidato {
    private String nome;
    private int idade;
    private int anosExperiencia;
    private String tecnologia;

    public Candidato(String nome, int idade, int anosExperiencia, String tecnologia) {
        this.nome = nome;
        this.idade = idade;
        this.anosExperiencia = anosExperiencia;
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", anosExperiencia=" + anosExperiencia +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
