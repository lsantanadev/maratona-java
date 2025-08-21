package academy.devdojo.maratonajava.javacore.TresourceBundle.test;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginMultilingue {
    public static void main(String[] args) {
        // Locale configurado (troque para Locale("pt","BR") para português)
        Locale locale = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        // Criação da janela
        JFrame frame = new JFrame(bundle.getString("login.title"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        // Componentes com textos do ResourceBundle
        JLabel lblUser = new JLabel(bundle.getString("login.username"));
        JTextField txtUser = new JTextField();

        JLabel lblPass = new JLabel(bundle.getString("login.password"));
        JPasswordField txtPass = new JPasswordField();

        JButton btnLogin = new JButton(bundle.getString("login.button"));

        // Adiciona na tela
        frame.add(lblUser);
        frame.add(txtUser);
        frame.add(lblPass);
        frame.add(txtPass);
        frame.add(new JLabel()); // espaço vazio
        frame.add(btnLogin);

        frame.setVisible(true);
    }
}

