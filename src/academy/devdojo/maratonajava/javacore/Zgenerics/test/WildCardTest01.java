package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest01 {
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


    }

    private static void printConculta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

        animals.add(new Cachorro());

    }
}
