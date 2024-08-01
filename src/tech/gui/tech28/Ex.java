package tech.gui.tech28;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class Ex {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");

        Object[][] row = {
                {"SV01","Nguyen Van Nam","CNTT1", 3.2},
                {"SV03","Nguyen Hung Lam","CNTT2", 2.7},
                {"SV02","Vo Quoc Lam","CNTT3", 2.9},
                {"SV04","Tran Van Thang","CNTT2", 3.5},
        };
        Object[] col = {"ID", "Full name", "Class", "GPA"};
        DefaultTableModel model = new DefaultTableModel(row, col); // Use DefaultTableModel
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setAutoCreateRowSorter(true);
        frame.add(scrollPane);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Access the data vector correctly
//       Vector <Object> data = new Vector<>();
//       data = model.getDataVector();
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.get(i));
//        }
    }
}
