package academy.devdojo.maratonajava.javacore.Kenum.dominio;

import java.util.Optional;

public class CatalogoFilmes {
    public static void main(String[] args) {
        System.out.println("---Classificações---");
        for (ClassificaçãoIndicativa classificacao : ClassificaçãoIndicativa.values()) {
            System.out.println(classificacao+ " - " + classificacao.getDescricao());
        }

        System.out.println("---Classificação selecionada---");
        final String entradaUsuario = "DEZESSEIS_ANOS";
        ClassificaçãoIndicativa.valueOf(entradaUsuario);
        System.out.println(entradaUsuario);
    }
}
