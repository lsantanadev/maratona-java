package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Subtracao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
