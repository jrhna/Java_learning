package tech.oop;

import javax.swing.*;

public class TaiXiu extends JDialog{
    private JPanel contentPane;
    private JCheckBox đặtTàiCheckBox;
    private JCheckBox đặtXĩuCheckBox;
    private JButton đặtCượcButton;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        TaiXiu tx = new TaiXiu();
        tx.pack();
        tx.setVisible(true);
        System.exit(0);
    }
}


