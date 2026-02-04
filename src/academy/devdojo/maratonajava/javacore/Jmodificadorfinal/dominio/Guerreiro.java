package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Guerreiro extends Personagem {
    private int forcaDeAtaque;

    public Guerreiro(String nome, int pontosDeVida, int forcaDeAtaque) {
        super(nome, pontosDeVida);
        this.forcaDeAtaque = forcaDeAtaque;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Força de Ataque: " + this.forcaDeAtaque);
    }

    public int getForcaDeAtaque() {
        return forcaDeAtaque;
    }

    public void setForcaDeAtaque(int forcaDeAtaque) {
        this.forcaDeAtaque = forcaDeAtaque;
    }
}
