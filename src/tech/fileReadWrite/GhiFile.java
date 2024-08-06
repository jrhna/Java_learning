package tech.fileReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GhiFile {

    public static void main(String[] args) {
       try {
           FileWriter ghiF = new FileWriter("input.txt");
           ghiF.write(" new học lập trình java"); // xoá hết dữ liệu cũ
           ghiF.close();
       } catch (IOException e){
           System.out.println(e);;
       }

    }
}
