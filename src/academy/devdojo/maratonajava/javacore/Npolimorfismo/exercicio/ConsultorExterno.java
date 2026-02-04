package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public class ConsultorExterno extends Colaborador {
    protected int horasTrabalhadasMes;
    protected double valorHora;

    public ConsultorExterno(String nome, int matricula, int horasTrabalhadasMes, double valorHora) {
        super(nome, matricula);
        this.horasTrabalhadasMes = horasTrabalhadasMes;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadasMes * this.valorHora;
    }

    @Override
    public void exibirDadosColaborador() {
        System.out.println("Exibindo informações - Consultor Externo");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadasMes);
        System.out.println("Valor da hora trabalhada: " + this.valorHora);
        double pagamento = calcularSalario();
        System.out.println("Pagamento: " + pagamento);

    }

    public int getHorasTrabalhadasMes() {
        return horasTrabalhadasMes;
    }

    public void setHorasTrabalhadasMes(int horasTrabalhadasMes) {
        this.horasTrabalhadasMes = horasTrabalhadasMes;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "ConsultorExterno{" +
                "horasTrabalhadasMes=" + horasTrabalhadasMes +
                ", valorHora=" + valorHora +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
