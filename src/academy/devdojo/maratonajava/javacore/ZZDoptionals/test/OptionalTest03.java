package academy.devdojo.maratonajava.javacore.ZZDoptionals.test;

import java.util.Optional;

public class OptionalTest03 {
    static void main() {

        boolean maria = encontrarNome("Maria").isPresent();// → true
        boolean vazio = encontrarNome("").isPresent();// → false
        boolean nulo = encontrarNome(null).isPresent();// → false

        System.out.println(maria);
        System.out.println(vazio);
        System.out.println(nulo);
    }


    public static Optional<String> encontrarNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(nome);

    }
}
