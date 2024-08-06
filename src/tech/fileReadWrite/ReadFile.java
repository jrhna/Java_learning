package tech.fileReadWrite;

import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            if(file.createNewFile()){
                System.out.println("file vua duoc tao");
            } else {
                System.out.println("file da ton tai");
            }
        } catch (IOException ex) {
            System.out.println(ex);;
        }

    }

}
