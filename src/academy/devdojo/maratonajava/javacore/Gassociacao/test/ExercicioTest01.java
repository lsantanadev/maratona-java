package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("São josé");

        Aluno aluno1 = new Aluno("Leonardo", 26);
        Seminario seminario1 = new Seminario("Como vender mais", local, new Aluno[]{aluno1});
        aluno1.setSeminario(seminario1);

        Aluno aluno2 = new Aluno("Daniela", 27);
        Seminario seminario2 = new Seminario("Programação OOP", local, new Aluno[]{aluno2});
        aluno2.setSeminario(seminario2);

        Aluno aluno3 = new Aluno("Paula", 33);
        Seminario seminario3 = new Seminario("Design Patterns", local, new Aluno[]{aluno3});
        aluno3.setSeminario(seminario3);

        Aluno aluno4 = new Aluno("Livia", 20);
        Seminario seminario4 = new Seminario("JAVA", local, new Aluno[]{aluno4});
        aluno4.setSeminario(seminario4);

        Aluno[] alunos = new Aluno[]{aluno1, aluno2, aluno3, aluno4};

        Seminario[] seminarios = new Seminario[]{seminario1, seminario2, seminario3, seminario4};


        Professor professor1 = new Professor("Jiraya Sensei", "Ninjutsu", seminarios);
        Professor professor2 = new Professor("Kakashi Sensei", "Sharingan", seminarios);
        Professor[] professores = new Professor[]{professor1, professor2};

        System.out.println("-------Alunos----------");
        for (Aluno aluno : alunos) {
            aluno.imprime();
        }

        System.out.println("-------Professores-----------");
        for (Professor professore : professores) {
            professore.imprime();
        }

        System.out.println("--------------Seminarios----------------");
        for (Seminario seminario : seminarios) {
            seminario.imprime();
        }


    }
}
