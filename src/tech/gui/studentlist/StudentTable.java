package tech.gui.studentlist;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentTable extends JFrame {
    public StudentTable(){
        init();
        run();

    }

    private void init(){
        setTitle("Student");
        setSize(400,300);
        setContentPane(panel1);
        this.tbStudent.setModel(new DefaultTableModel(
                new Object [][]  {
                {"SV01","Nguyen Van Nam","CNTT1", 3.2},
                {"SV03","Nguyen Hung Lam","CNTT2", 2.7},
                {"SV02","Vo Quoc Lam","CNTT3", 2.9},
                {"SV04","Tran Van Thang","CNTT2", 3.5},
        },
                new String [] {"ID","Full name","Class","GPA"
                })
        );
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDeleteActionPerformed(e);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddNewStudnet(null);
            }
        });
//        Object [][] row = {
//                {"SV01","Nguyen Van Nam","CNTT1", 3.2},
//                {"SV03","Nguyen Hung Lam","CNTT2", 2.7},
//                {"SV02","Vo Quoc Lam","CNTT3", 2.9},
//                {"SV04","Tran Van Thang","CNTT2", 3.5},
//        };
//        Object [ ]col = {"ID","Full name","Class","GPA"};
//        setContentPane(new StudentTable().panel1);
    }
    public void btnDeleteActionPerformed(ActionEvent e){
            int deleteRow = tbStudent.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)tbStudent.getModel();
            if(deleteRow!=-1){ // nếu không có dòng nào đc chọn, nó sẽ trả về -1
                model.removeRow(deleteRow);
            }
    }

    public void run(){
        setVisible(true);
    }
    private JTable tbStudent;
    public JPanel panel1;
    private JButton btnDelete;
    private JButton btnAdd;
    private JScrollPane jslPane;


}
