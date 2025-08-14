package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Retangulo extends Forma {
    protected double largura;
    protected double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retangulo " + this.cor + " com largura " + this.largura + " e altura " + this.altura);
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
