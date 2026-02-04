package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Rivaldo");
        Jogador[] jogadores = {jogador1, jogador2};

        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- jogadores ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
