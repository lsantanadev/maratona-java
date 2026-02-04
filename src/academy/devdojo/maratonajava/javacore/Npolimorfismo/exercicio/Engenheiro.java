package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public class Engenheiro extends Colaborador {
    protected NivelExperiencia nivelExperiencia;
    protected String departamento;

    public Engenheiro(String nome, int matricula, NivelExperiencia nivelExperiencia, String departamento) {
        super(nome, matricula);
        this.nivelExperiencia = nivelExperiencia;
        this.departamento = departamento;
    }

    public Engenheiro(String nome, int matricula) {
        super(nome, matricula);
    }


    public double calculoBonusSalario() {
        if (nivelExperiencia == NivelExperiencia.JUNIOR) {
            return nivelExperiencia.getSalarioPorNivel() * 0.10;
        } else if (nivelExperiencia == NivelExperiencia.PLENO) {
            return nivelExperiencia.getSalarioPorNivel() * 0.20;
        } else {
            return nivelExperiencia.getSalarioPorNivel() * 0.50;
        }
    }

    @Override
    public double calcularSalario() {
        final double bonus = calculoBonusSalario();
        return nivelExperiencia.getSalarioPorNivel() + bonus;
    }

    @Override
    public void exibirDadosColaborador() {
        System.out.println("Exibindo informações - Engenheiro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Nivel: " + nivelExperiencia.getNomeNivel());
        System.out.println("Bonus de pagamento: " + calculoBonusSalario());
        System.out.println("Pagamento: " + calcularSalario());
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "nivelExperiencia=" + nivelExperiencia +
                ", departamento='" + departamento + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
