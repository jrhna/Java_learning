package tech.gui;

import javax.swing.*;

public class loginForm extends JFrame {
    private JTextField tfUserName;
    private JPasswordField tfPassword;
    private JPanel loginPanel;
    private JButton loginButton;
    private JButton cancleButton;

    public loginForm (){
        setTitle("Login");
        setSize(400,300);
        setContentPane(loginPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new loginForm();
    }
}
