package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Multiplicacao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
