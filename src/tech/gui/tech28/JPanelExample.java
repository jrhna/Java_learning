package tech.gui.tech28;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JButton btn1 = new JButton("left");
        JButton btn2 = new JButton("right");


        btn1.setBounds(20,20,50,80);
        btn2.setBounds(80,20,50,80);
        pn1.add(btn1);
        pn2.add(btn2);
        pn1.setBackground(Color.blue);
        pn2.setBackground(Color.green);
        pn1.setBounds(50,10,200,100);
        pn2.setBounds(260,10,200,100);
        frame.add(pn1);
        frame.add(pn2);

        frame.setSize(500,150);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setVisible(true);

    }
}
