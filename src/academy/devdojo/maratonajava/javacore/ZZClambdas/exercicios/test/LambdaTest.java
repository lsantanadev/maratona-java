package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain.Candidato;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest {
    static void main() {
        List<Candidato> candidates = List.of(new Candidato("Leonardo", 27, 2, "Java"),
                new Candidato("Daniela", 28, 3, "JavaScript"),
                new Candidato("Pedro", 30, 6, "React"));

        List<Candidato> age = filter(candidates, c -> c.getIdade() >= 28);
        List<Candidato> react = filter(candidates, c -> c.getTecnologia().equals("React"));
        List<Candidato> java = filter(candidates, c -> c.getTecnologia().equals("Java"));

        System.out.println(age);
        System.out.println(react);
        System.out.println(java);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }
}
