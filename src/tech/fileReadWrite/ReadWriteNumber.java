package tech.fileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteNumber {
    public static void main(String[] args) {
        try {
            File fl =new File("inNum.txt");
            Scanner sc = new Scanner(fl); // nhap tu file inNum
            if(fl.createNewFile()){
                System.out.println("file vua duoc tao moi");
            } else {
                System.out.println("file already exist");
            }
            // ghi, thêm vào dòng cuối cùng
            FileWriter writeFile = new FileWriter("outNum.txt",true);
            while ( sc.hasNext()){
                int n = sc.nextInt(); // nhap tu file inNum ra bien n
                writeFile.write(n + " "); // ghi n vào file outNum;
            }
            writeFile.close();
            sc.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
