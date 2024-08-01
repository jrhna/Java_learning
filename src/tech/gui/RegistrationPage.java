package tech.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JDialog {
    private JTextField tfName;
    private JTextField tfPhone;
    private JTextField tfEmail;
    private JTextField tfAddress;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerPanel;

    public RegistrationPage (JFrame parent){
        super (parent);
        setTitle("Create a new account");
        setContentPane(registerPanel);
        this.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(registerPanel,"helo");
            }
        });
        setMinimumSize(new Dimension(450,450));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);

    }

    public static void main(String[] args) {
        RegistrationPage myForm = new RegistrationPage(null);


    }
}
