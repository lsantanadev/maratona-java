package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Motocicleta;

public class HerancaVeiculosTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix", 2015, 5);
        carro.exibirInformacoes();
        System.out.println("-----------------------");
        Motocicleta moto = new Motocicleta("Yamaha", "Fazer 125", 2010, true);
        moto.exibirInformacoes();
    }
}
