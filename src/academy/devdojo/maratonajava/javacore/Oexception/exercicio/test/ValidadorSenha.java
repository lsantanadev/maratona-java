package academy.devdojo.maratonajava.javacore.Oexception.exercicio.test;

import java.io.IOException;

public class ValidadorSenha {
    public static void main(String[] args) {
        try {
            validarSenha("154515423");
        } catch (IOException e) {
            System.out.println("Falha na validação: " + e.getMessage());
        }
    }

    public static void validarSenha(String senha) throws IOException {
        if (senha.length() <= 8) throw new IOException("Senha muito curta");
        System.out.println("Senha validada com sucesso!");
    }
}

