package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Paladino implements Combatente, Conjurador {
    private String nome;
    private String divindadeProtetora;

    public Paladino(String nome, String divindadeProtetora) {
        this.nome = nome;
        this.divindadeProtetora = divindadeProtetora;
    }

    @Override
    public void atacar(String alvo) {
        System.out.println(this.nome + " paladino, golpeia " + alvo + " com sua maça sagrada");
    }

    @Override
    public void defender() {
        System.out.println(this.nome + " usa sua fé para se defender");
    }

    @Override
    public void esquivar() {
        Combatente.super.esquivar();
    }

    @Override
    public String getNomeConjurador() {
        return nome;
    }

    @Override
    public void lancarMagia(String magia, String alvo) {
        System.out.println(this.nome + " invoca " + magia + " através de " + divindadeProtetora + " sobre " + alvo);
    }

    @Override
    public void recuperarMana() {
        System.out.println(this.nome + " reza para " + divindadeProtetora + " e sente suas energias divinas restauradas");
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDivindadeProtetora() {
        return divindadeProtetora;
    }

    public void setDivindadeProtetora(String divindadeProtetora) {
        this.divindadeProtetora = divindadeProtetora;
    }
}
