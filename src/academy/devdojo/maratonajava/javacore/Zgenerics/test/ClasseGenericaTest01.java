package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Onix"), new Carro("Gol")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);

        Carro c = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por 1 mes....");
        rentalService.devolverObjeto(c);

        System.out.println("---------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco b = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando barco por 1 mes....");
        rentalServiceBarco.devolverObjeto(b);


    }
}
