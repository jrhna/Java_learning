package tech.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class TaiXiu extends JFrame{
    private JPanel jPanelMain;
    private JButton datCuocButton;
    private JButton datT;
    private JButton datX;

    public TaiXiu  (){
        final int[] num = new int[1];
        this.datT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num[0] =1;
            }
        });
        this.datX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num[0] =0;
            }
        });
        this.datCuocButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int check = ThreadLocalRandom.current().nextInt(0,2);
                if(num[0]==check) {
                    JOptionPane.showMessageDialog(null,"win");
                   // datCuocButton.setText("win");
                   // System.out.println();
                }
            }
        });

    }
    public static void main(String[] args) {
       TaiXiu tx = new TaiXiu();
        tx.setContentPane(tx.jPanelMain);
        tx.setTitle("Game");
        tx.setSize(400,300);
       // tx.pack();
        tx.setLocationRelativeTo(null);
        tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tx.setVisible(true);
    }


}


