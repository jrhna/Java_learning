package tech.gui.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JDialog {
    public User user;
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
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());
        if(name.isEmpty()||email.isEmpty()||phone.isEmpty()||address.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Please enter again",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(this,
                    "Please enter password again",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
      this.user = addUserToDatabase(name, email, phone, address, password);
        if(user!=null){
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Sign up fail, please enter again",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private User addUserToDatabase(String name, String email, String phone, String address, String password) {
        User user = null;
        return user;
    }

    public void runRegister (){
        setVisible(true);
    }


    public static void main(String[] args) {
       // RegistrationPage myForm = new RegistrationPage(null);
        new RegistrationPage(null);

    }
}
