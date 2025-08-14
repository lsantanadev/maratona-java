package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Engenheiro("Leonardo", 45862, NivelExperiencia.JUNIOR, "Tecnologia");
        Colaborador colaborador2 = new ConsultorExterno("Daniela", 45862, 280, 20);
        Colaborador colaborador3 = new Estagiario("Raphael", 55752, "Senac EAD");

        FolhaDePagamento.processarPagamentoColaborador(colaborador1);
        System.out.println("--------------------------------");
        FolhaDePagamento.processarPagamentoColaborador(colaborador2);
        System.out.println("--------------------------------");
        FolhaDePagamento.processarPagamentoColaborador(colaborador3);
    }
}
