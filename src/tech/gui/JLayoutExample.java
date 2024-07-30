package tech.gui;

import javax.swing.*;
import java.awt.*;

public class JLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        JButton btnEast = new JButton("East");
        JButton btnWest = new JButton("West");
        JButton btnCenter = new JButton("Center");
        JButton btnBotom = new JButton("Bottom");
        JButton btnTop = new JButton("Top");

        frame.setLayout(new BorderLayout(10,10));
        frame.setSize(500,500);

        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest,BorderLayout.WEST);
        frame.add(btnBotom,BorderLayout.NORTH);
        frame.add(btnCenter,BorderLayout.CENTER);
        frame.add(btnTop,BorderLayout.SOUTH);


        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setLayout(null);
        frame.setVisible(true);
    }
}
