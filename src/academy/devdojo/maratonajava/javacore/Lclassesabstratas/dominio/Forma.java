package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();

    public abstract void desenhar();

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "cor='" + cor + '\'' +
                '}';
    }
}
