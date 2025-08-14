package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Circulo extends Forma {
    protected double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um circulo " + this.cor + " com raio " + this.raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                '}';
    }
}
