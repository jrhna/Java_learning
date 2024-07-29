package tech.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiDemo {
    private JButton button1;
    private JPanel panel1;
    private JButton submit;

    public guiDemo() { 
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null,"helo");
            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"chao");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setContentPane(new guiDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
