package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("88115-218");

        Pessoa pessoa = new Pessoa("Leonardo");
        pessoa.setCpf("04102431080");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("kakashi");
        funcionario.setCpf("56865412565");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(25000);

        System.out.println("----------------");
        funcionario.imprime();
    }
}
