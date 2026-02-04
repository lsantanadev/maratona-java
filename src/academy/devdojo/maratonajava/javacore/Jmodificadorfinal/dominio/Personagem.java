package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Personagem {
    protected String nome;
    protected int pontosDeVida;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
    }

    public void receberDano(int dano){
        pontosDeVida -= dano;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontos de vida: "+ this.pontosDeVida);
    }

    public final String getNomeComCodigo() {
        return this.nome + " #c12563";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}
