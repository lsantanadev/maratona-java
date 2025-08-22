package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/leonardo/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1); // imprime home/leonardo/dev/../../arquivo.txt (ERRADO)
        System.out.println(path1.normalize()); // imprime home/arquivo.txt (CERTO)

        Path path2 = Paths.get("/home/./leonardo/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
