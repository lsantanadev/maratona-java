package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("ONix");
        System.out.println(Carro.VELOCIDADE_MAXIMA);

        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
