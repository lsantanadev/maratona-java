package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class CalculadoraFlex {

    public static void executarOperacao(OperacaoMatematica operacao, double num1, double num2) {
        double resultado = operacao.calcular(num1, num2);
        System.out.println("O resultado da " + operacao.getClass().getSimpleName() + " entre " + num1 + " e " + num2 + " é " + resultado);
    }

}
