package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Conjurador {
    String getNomeConjurador();

    void lancarMagia(String magia, String alvo);

    default void recuperarMana() {
        System.out.println(getNomeConjurador() + " esta recuperando mana");
    }
}
