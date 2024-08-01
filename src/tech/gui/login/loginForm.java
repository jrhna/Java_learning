package tech.gui.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame {
    private JTextField tfUserName;
    private JPasswordField tfPassword;
    private JPanel loginPanel;
    private JButton loginButton;
    private JButton cancleButton;
    private JButton registerButton;

    public loginForm (){
       init();
       run();



    }
    public void init(){
        setTitle("Login");
        setSize(400,300);
        setContentPane(loginPanel);
        this.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //   JOptionPane.showMessageDialog(null,"helo");
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrationPage(null);
            }
        });

        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfUserName.setText("");
                tfPassword.setText("");
            }
        });

    }
    public void run (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new loginForm();
    }
}
