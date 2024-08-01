package tech.gui.login;

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
        super(parent);
        initRegister();
        runRegister();
    }
    public void initRegister () {
        setTitle("Create a new account");
        setContentPane(registerPanel);
        this.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(registerPanel,"helo");
                register();

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setMinimumSize(new Dimension(450,360));
        setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void register() {
    }

    public void runRegister (){
        setVisible(true);
    }


    public static void main(String[] args) {
        RegistrationPage myForm = new RegistrationPage(null);


    }
}
