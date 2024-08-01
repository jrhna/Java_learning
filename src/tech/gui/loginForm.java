package tech.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"helo");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new loginForm();
    }
}
