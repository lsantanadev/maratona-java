package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O dev dojo é o melhor\nMelhor curso de java do brasil\n");
            fw.flush(); // força a escrita do arquivo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
