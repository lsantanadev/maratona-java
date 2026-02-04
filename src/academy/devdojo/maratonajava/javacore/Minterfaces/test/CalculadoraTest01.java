package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.*;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        CalculadoraFlex.executarOperacao(soma, 11, 6);
        CalculadoraFlex.executarOperacao(subtracao, 50, 12);
        CalculadoraFlex.executarOperacao(multiplicacao, 2, 6);
        CalculadoraFlex.executarOperacao(divisao, 10, 5);


    }
}
