package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public abstract class Colaborador implements CalculadoraSalario, Relatorio {
    protected String nome;
    protected int matricula;

    public Colaborador(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
