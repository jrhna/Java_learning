package tech.gui;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Exam");
        JButton [] btn = new JButton[64];
        for (int i=0; i < 64; i++){
            btn [i] = new JButton();
        }
        int k=0;
        for(int i = 0 ; i < 8; i++){
            for(int j=0;j<8;j++){
                if((j%2==0) && (i%2==0)||(j%2!=0) && (i%2!=0)){
                    btn[k].setBackground(Color.BLACK);
                    k++;
                }
                else{
                    btn[k].setBackground(Color.WHITE);
                    k++;
                }
            }
        }
        frame.setLayout(new GridLayout(8,8));
        for (int i =0;i<64;i++){
            frame.add(btn[i]);
        }
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
