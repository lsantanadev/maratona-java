package academy.devdojo.maratonajava.javacore.ZZClambdas.exercicios.domain;

public class UsersValidator {
    public static boolean validateCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean validateEmail(String email) {
        return email != null && email.matches("^[\\w.+\\-]+@[\\w\\-]+\\.[a-z]{2,}$");
    }

    public static boolean validateTelefone(String telefone) {
        return telefone != null && telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}");
    }
}
