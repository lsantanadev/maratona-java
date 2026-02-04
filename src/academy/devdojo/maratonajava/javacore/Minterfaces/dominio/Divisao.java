package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Divisao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a / b;
    }
}
