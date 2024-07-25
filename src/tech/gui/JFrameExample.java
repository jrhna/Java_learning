package tech.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JLabel labelUsername = new JLabel("Username");
        JLabel labelPassword = new JLabel("Password");
        JTextField username = new JTextField("");
        JPasswordField password = new JPasswordField("");
        JButton buttonSubmit = new JButton("Login");
        JTextArea text = new JTextArea("");


        labelUsername.setBounds(20,20,100,30);
        username.setBounds(100,20,150,30);
        labelPassword.setBounds(20,70,100,30);
        password.setBounds(100,70,150,30);
        buttonSubmit.setBounds(110,120,80,30);
        text.setBounds(20,160,250,50);
        text.setLineWrap(true);// tự động xuống dòng -> tự động cắt từ khi xuống dòng
        text.setWrapStyleWord(true); // gói từ lại lúc xuống dòng
        text.setText("Message");
        //đăng kí sự kiện cho nút button
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Submit");
               // System.out.println(username.getText());
              //  System.out.println(password.getPassword());
                buttonSubmit.setText("Done!");
            }
        });
        frame.add(buttonSubmit);
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(username);
        frame.add(password);
        frame.add(text);
        frame.setSize(300,250); //Kich thuoc khung frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //khi x form thì sẽ tắt chạy chương tình luôn
        frame.setLocationRelativeTo(null); // frame sẽ hiển thị ngay giữa
        frame.setLayout(null);
        frame.setVisible(true);// hiển thị frame


    }
}
