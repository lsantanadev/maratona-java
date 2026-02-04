package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Motocicleta extends Veiculo{
    private boolean temPartidaEletrica;

    public Motocicleta(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println(this.temPartidaEletrica);
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }
}
