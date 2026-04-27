package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain.Users;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest02 {
    static void main() {
        List<Users> users = List.of(
                new Users("Mahito", "mahito@email.com", "7837647484"),
                new Users("Toji fushiguro", "toji@email.com", "34567677675"));

        Consumer<Users> enviarEmail = u ->
                System.out.println("Email enviado para " + u.getEmail());

        Consumer<Users> enviarSMS = u ->
                System.out.println("SMS enviado para " + u.getTelefone());

        Consumer<Users> notificacaoEncadeada = enviarSMS.andThen(enviarEmail);

        notificar(users, notificacaoEncadeada);
    }

    private static <T> void notificar(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

}
