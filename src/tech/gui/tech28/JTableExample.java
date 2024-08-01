package tech.gui.tech28;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class JTableExample {
    public static void main(String[] args) {
        ///JTable(Object[][] rows, Object[] cols)
        //-Các ô trên bảng đều có thể chỉnh sửa được
        //
        //-Dữ liệu của các ô trên bảng đều được coi là kiểu dữ liệu String
        //-Chúng yêu cầu bạn đặt tất cả dữ liệu của bảng vào một mảng hoặc vectơ, điều này
        //có thể không phù hợp với một số dữ liệu.
        JFrame frame = new JFrame("JTable Example");

        Object [][] row = {
                {"SV01","Nguyen Van Nam","CNTT1", 3.2},
                {"SV03","Nguyen Hung Lam","CNTT2", 2.7},
                {"SV02","Vo Quoc Lam","CNTT3", 2.9},
                {"SV04","Tran Van Thang","CNTT2", 3.5},
        };
        Object [ ]col = {"ID","Full name","Class","GPA"};
        JTable table = new JTable(row,col);
//tao scrollPane or sd borderLayout
        JScrollPane scrollPane = new JScrollPane(table);
        table.setAutoCreateRowSorter(true); // sap xep
        frame.add(scrollPane); // khong hien thi ten cot -> tao scroll pane
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println(table.getValueAt(3,1)); // kieeur tra ve laf object

        table.setValueAt("CNTT3",3,2);
        DefaultTableModel model = (DefaultTableModel)(table.getModel());
        model.addRow(new Object[] {"SV06","leeeee", "CNTT4",3.4});
        model.removeRow(3);
    }
}
