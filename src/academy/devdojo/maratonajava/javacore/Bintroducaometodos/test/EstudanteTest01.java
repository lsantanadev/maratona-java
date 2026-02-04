package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante01.nome = "Leonardo";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Daniela";
        estudante02.idade = 28;
        estudante02.sexo = 'F';

        imprime.imprime(estudante01);
        imprime.imprime(estudante02);

    }
}
