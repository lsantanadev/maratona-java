package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro mustang = new Carro();

        fusca.nome = "Fusca bala";
        fusca.modelo = "Sport";
        fusca.ano = 1970;

        mustang.nome = "Mustang";
        mustang.modelo = "GT 500";
        mustang.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(fusca.nome);
        System.out.println(fusca.modelo);
        System.out.println(fusca.ano);

        System.out.println("------------------");

        System.out.println("Carro 2");
        System.out.println(mustang.nome);
        System.out.println(mustang.modelo);
        System.out.println(mustang.ano);
    }
}
