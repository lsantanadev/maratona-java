package academy.devdojo.maratonajava.javacore.Oexception.exercicio.test;

public class ProcessadorNomes {
    public static void main(String[] args) {
        // Para testar, execute o programa passando um nome, ex: java ProcessadorNomes Ana
        // Para testar o erro, execute sem passar nome, ex: java ProcessadorNomes

        try{
            String primeiroNome = args[0]; // Esta linha pode lançar a exceção
            System.out.println("Bem-vindo(a), " + primeiroNome.toUpperCase() + "!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: forneça pelo menos um nome");
        } finally {
            System.out.println("Processamento finalizado");
        }

    }
}
