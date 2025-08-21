package academy.devdojo.maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouceBundleTest01 {
    public static void main(String[] args) {
        /*
        * O ResourceBundle serve para gerenciar recursos externos como textos,
        * mensagens, labels e configurações que variam conforme o idioma
        * ou localidade, permitindo criar sistemas multilíngues de forma limpa e
        *  escalável.
        */
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

    }
}
