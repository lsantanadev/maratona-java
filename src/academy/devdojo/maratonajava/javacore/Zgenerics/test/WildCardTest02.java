package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    abstract static class Animal {

        abstract void consulta();

    }

    static class Cachorro extends Animal {
        @Override
        void consulta() {
            System.out.println("Consultando doguinho");
        }
    }

    static class Gato extends Animal {

        @Override
        void consulta() {
            System.out.println("Consultando gato");
        }
    }

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }

    private static void printConculta(List<? extends Animal> animals) {
        Animal dog = new Cachorro(); // Não aceita, não possui garantia de qual objeto virá
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        // Aceita adicionar diversos tipos por conta do polimorfismo
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
