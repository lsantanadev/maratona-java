package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("O dev dojo é o melhor");
                bw.newLine();
                bw.write("Melhor curso de java do brasil");
                bw.flush(); // força a escrita do arquivo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
