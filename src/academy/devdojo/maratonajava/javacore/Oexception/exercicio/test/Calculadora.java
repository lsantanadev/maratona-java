package academy.devdojo.maratonajava.javacore.Oexception.exercicio.test;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Divisão ---");
        int resultado = 0;
        try {
            System.out.print("Digite o primeiro número: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int denominador = scanner.nextInt();

            resultado = numerador / denominador;
        } catch (RuntimeException e) {
            System.out.println("Erro: operação inválida");
        }
        System.out.println("O resultado da divisão é: " + resultado);
        scanner.close();
    }
}
