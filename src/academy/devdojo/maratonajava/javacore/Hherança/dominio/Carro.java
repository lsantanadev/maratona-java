package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println(this.numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
