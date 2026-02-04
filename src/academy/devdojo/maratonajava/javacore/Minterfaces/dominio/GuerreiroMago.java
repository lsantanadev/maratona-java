package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class GuerreiroMago implements Combatente, Conjurador{
    private String nome;
    private int nivelForca;
    private int nivelMana;

    public GuerreiroMago(String nome, int nivelForca, int nivelMana) {
        this.nome = nome;
        this.nivelForca = nivelForca;
        this.nivelMana = nivelMana;
    }

    @Override
    public void atacar(String alvo) {
        System.out.println(this.nome + " ataca " + alvo + " com sua espada poderosa");
    }

    @Override
    public void defender() {
        System.out.println(this.nome + " levanta seu escudo para se defender");
    }

    @Override
    public void esquivar() {
        Combatente.super.esquivar();
    }

    @Override
    public void lancarMagia(String magia, String alvo) {
        System.out.println(this.nome + " lança a magia " + magia + " em " + alvo);
    }

    @Override
    public void recuperarMana() {
        Conjurador.super.recuperarMana();
    }

    public String getNome() {
        return nome;
    }

    public String getNomeConjurador(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelForca() {
        return nivelForca;
    }

    public void setNivelForca(int nivelForca) {
        this.nivelForca = nivelForca;
    }

    public int getNivelMana() {
        return nivelMana;
    }

    public void setNivelMana(int nivelMana) {
        this.nivelMana = nivelMana;
    }
}
