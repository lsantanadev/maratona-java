package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Leonardo"; // String constant pool
        String nome2 = "Leonardo";
        nome = nome.concat(" Santana"); // nome += " Santana"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Leonardo"); //1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
