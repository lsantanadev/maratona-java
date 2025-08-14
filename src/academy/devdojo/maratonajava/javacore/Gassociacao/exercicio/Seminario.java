package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if (alunos == null) return;
        System.out.println("Alunos matriculados: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
