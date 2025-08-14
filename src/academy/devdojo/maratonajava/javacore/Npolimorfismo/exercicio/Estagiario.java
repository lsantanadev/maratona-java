package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public class Estagiario extends Colaborador{
    protected String instituicaoDeEnsino;
    public static final double BOLSA_AUXILIO = 750;

    public Estagiario(String nome, int matricula, String instituicaoDeEnsino) {
        super(nome, matricula);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public double calcularSalario() {
        return BOLSA_AUXILIO;
    }

    @Override
    public void exibirDadosColaborador() {
        System.out.println("Exibindo Informações - Estagiário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Instituição de ensino: " + this.instituicaoDeEnsino);
        System.out.println("Bolsa auxilio: " + BOLSA_AUXILIO);

    }

    public String getInstituicaoDeEnsino() {
        return instituicaoDeEnsino;
    }

    public void setInstituicaoDeEnsino(String instituicaoDeEnsino) {
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "instituicaoDeEnsino='" + instituicaoDeEnsino + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
