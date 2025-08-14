package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Circulo;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Retangulo;

public class DesenhoTest01 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Azul", 5.95, 7.5);
        Circulo circulo = new Circulo("Vermelho", 7.22);

        System.out.println(circulo.calcularArea());
        circulo.desenhar();
        System.out.println("--------");
        System.out.println(retangulo.calcularArea());
        retangulo.desenhar();

    }
}
