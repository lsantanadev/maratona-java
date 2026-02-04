package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.GuerreiroMago;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Paladino;

public class ArenaDosHeroisTest {
    public static void main(String[] args) {
        GuerreiroMago guerreiroMago = new GuerreiroMago("Zoro", 250, 200);
        Paladino paladino = new Paladino("Artimus", "Hera");

        guerreiroMago.atacar("Goblin");
        guerreiroMago.defender();
        guerreiroMago.esquivar();
        guerreiroMago.lancarMagia("Bola de fogo", "Goblin");
        guerreiroMago.recuperarMana();

        System.out.println("------------------------");

        paladino.atacar("Goblin");
        paladino.defender();
        paladino.esquivar();
        paladino.lancarMagia("Bola de fogo", "Goblin");
        paladino.recuperarMana();
    }
}
