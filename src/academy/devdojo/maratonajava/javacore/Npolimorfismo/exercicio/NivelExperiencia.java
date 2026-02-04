package academy.devdojo.maratonajava.javacore.Npolimorfismo.exercicio;

public enum NivelExperiencia {
    JUNIOR("Junior", 2500),
    PLENO("Pleno", 5000),
    SENIOR("Senior", 10000);

    private String nomeNivel;
    private double salarioPorNivel;

    NivelExperiencia(String nomeNivel, double salarioPorNivel) {
        this.nomeNivel = nomeNivel;
        this.salarioPorNivel = salarioPorNivel;
    }

    public String getNomeNivel() {
        return nomeNivel;
    }

    public double getSalarioPorNivel() {
        return salarioPorNivel;
    }
}
