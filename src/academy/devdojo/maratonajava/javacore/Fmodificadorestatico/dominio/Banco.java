package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Banco {
    public static int totalContas;
    public String titular;

    public Banco(String titular) {
        this.titular = titular;
        totalContas++;
    }

    public static void imprimeTotalContas(){
        System.out.println("Total de contas criadas: " + totalContas);
    }
}
