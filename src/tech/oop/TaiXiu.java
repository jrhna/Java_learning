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
    private JButton btnCancle;
    protected int num;
    protected int check;
    public TaiXiu  (){
        setTitle("game");
        setContentPane(jPanelMain);
        setSize(400,300);

        this.datT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               check = ThreadLocalRandom.current().nextInt(0,2);
                System.out.println(check);
               num = 1;
            }
        });
        this.datX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check = ThreadLocalRandom.current().nextInt(0,2);
                num = 0;
                System.out.println(check);
            }
        });
        this.datCuocButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(num == check) {
                    JOptionPane.showMessageDialog(null,"Chúc mừng bạn đã thành đại gia\nChơi tiếp để thành tỉ phú nào!!!");
                    System.out.println(num + " " + check);
                   // datCuocButton.setText("win");
                   // System.out.println();
                }
                else
                {
                    System.out.println(num + " " + check);
                    if(check==1){
                        JOptionPane.showMessageDialog(null,"Bạn đã đặt xĩu\nBạn thua rồi, đặt cược tìm cơ hội mới nào!\nGame này chiến hơn fifai !!!");
//                        JOptionPane.showMessageDialog(null,"Bạn thua rồi, đặt cược tìm cơ hội mới nào!");
//                        JOptionPane.showMessageDialog(null,"Game này chiến hơn fifai !!!");
                    } else {
                        JOptionPane.showMessageDialog(null,"Bạn đã đặt xĩu\nBạn thua rồi, đặt cược tìm cơ hội mới nào!\nGame này chiến hơn fifai !!!");
//                        JOptionPane.showMessageDialog(null,"Bạn thua rồi, đặt cược tìm cơ hội mới nào!");
//                        JOptionPane.showMessageDialog(null,"Game này chiến hơn fifai !!!");
                    }

                }
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnCancle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
       new TaiXiu();
//        tx.setContentPane(tx.jPanelMain);
//        tx.setTitle("Game");
//        tx.
//       // tx.pack();

    }


}


