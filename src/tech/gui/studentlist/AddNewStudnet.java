package tech.gui.studentlist;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// dont send instance from form to form

public class AddNewStudnet extends JDialog{
    private JTextField tfID;
    private JTextField tfName;
    private JTextField tfClass;
    private JTextField tfGpa;
    private JButton btnAdd;
    private JButton btnCLear;
    private JLabel lbID;
    private JLabel lbName;
    private JLabel lbClass;
    private JLabel lbGPA;
    private JPanel pnMain;

    public AddNewStudnet(JFrame parent){
        super(parent);
        init();
        run();
    }
    public void init (){
        setTitle("Add new student");
        setContentPane(pnMain);
        setMinimumSize( new Dimension(400,600));
        setLocationRelativeTo(null);
        this.btnAdd.addActionListener(this::btnAddActionPerformed);
        this.btnCLear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("");
                tfName.setText("");
                tfClass.setText("");
                tfGpa.setText("");
            }
        });
    }
    public void run(){
        setVisible(true);
    }
//    public Student getStudent(){
//        return ;
//    }
    public void btnAddActionPerformed(ActionEvent e){
        String id = tfID.getText();
        String name = tfName.getText();
        String className = tfClass.getText();
        double gpa = Double.parseDouble(tfGpa.getText());
        Student st = new Student(id, name, className, gpa);
    }
    public static void main(String[] args) {
        new AddNewStudnet(null);
    }
}
