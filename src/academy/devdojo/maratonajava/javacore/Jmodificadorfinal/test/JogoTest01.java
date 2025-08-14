package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Guerreiro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Jogo;

public class JogoTest01 {
    public static void main(String[] args) {
        System.out.println(Jogo.NOME_JOGO);
        System.out.println(Jogo.MAX_NIVEL_PERSONAGEM);
        Jogo.TIPOS_TERRENO_PERMITIDOS[0] = "Pantano";

        Jogo sessaoAlpha = new Jogo("5682236");
        Jogo sessaoBeta = new Jogo("56566588");

        sessaoAlpha.exibirConfiguracoes();
        System.out.println("----------------");
        sessaoBeta.exibirConfiguracoes();

        Guerreiro guerreiro = new Guerreiro("Alpha", 100, 66);
        System.out.println("-----------------");
        guerreiro.exibirInfo();
        System.out.println("--------------");
        guerreiro.getNomeComCodigo();

        System.out.println("----------------");
        guerreiro.receberDano(20);
        guerreiro.exibirInfo();
    }
}
