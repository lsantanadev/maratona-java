package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain.Users;
import academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain.UsersValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceTest01 {
    static void main() {
        List<Users> list = new ArrayList<>(List.of(
                new Users("Leonardo", "83839303", "lsantana@gmail.com", "73273838398"),
                new Users("Daniela", "09090909090", "dani@gmail.com", "(48) 99999-0001"),
                new Users("Ana", "12345678901", "ana@email.com", "(48) 99999-0001")));

        Predicate<Users> cpfValid = u -> UsersValidator.validateCpf(u.getCpf());
        Predicate<Users> emailValid = u -> UsersValidator.validateEmail(u.getEmail());
        Predicate<Users> telValid = u -> UsersValidator.validateTelefone(u.getTelefone());

        System.out.println("Usuários válidos: ");
        list.stream()
                .filter(cpfValid)
                .filter(emailValid)
                .filter(telValid)
                .forEach(System.out::println);

        System.out.println("Usuários inválidos:");
        list.stream()
                .filter(cpfValid.negate().or(emailValid.negate()).or(telValid.negate()))
                .forEach(System.out::println);


    }
}
