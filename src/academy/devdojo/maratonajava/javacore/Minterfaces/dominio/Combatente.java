package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Combatente {
    void atacar(String alvo);
    void defender();
    String getNome();

    default void esquivar(){
        System.out.println(getNome() + " se esquiva rapidamente");
    }
}
