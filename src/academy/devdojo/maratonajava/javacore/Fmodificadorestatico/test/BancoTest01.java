package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Banco;

public class BancoTest01 {
    public static void main(String[] args) {
        Banco conta1 = new Banco("Leonardo");
        Banco conta2 = new Banco("Leonardo");
        Banco conta3 = new Banco("Leonardo");
        Banco conta4 = new Banco("Leonardo");

        Banco.imprimeTotalContas();
    }
}
