package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;


public class Jogo {
    public static final String NOME_JOGO = "Aventura Final";
    public static final int MAX_NIVEL_PERSONAGEM = 100;
    public static final String[] TIPOS_TERRENO_PERMITIDOS = new String[]{"MONTANHA", "FLORESTA", "DESERTO"};
    private final String ID_INSTANCIA_JOGO;

    public Jogo(String id) {
        ID_INSTANCIA_JOGO = "lssdev";
    }

    public void exibirConfiguracoes() {
        System.out.println("Jogo: " + NOME_JOGO);
        System.out.println("Nivel maximo do personagem" + MAX_NIVEL_PERSONAGEM);
        System.out.println("Terrenos: ");
        for (String terrenoPermitido : TIPOS_TERRENO_PERMITIDOS) {
            System.out.println(terrenoPermitido);
        }
        System.out.println("ID: " + ID_INSTANCIA_JOGO);

    }

    public String getID_INSTANCIA_JOGO() {
        return ID_INSTANCIA_JOGO;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "ID_INSTANCIA_JOGO='" + ID_INSTANCIA_JOGO + '\'' +
                '}';
    }
}
