package tech.fileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) {
        try {
            File fl = new File("input.txt");
            Scanner scaner = new Scanner(fl); //Nhap tu file ra
            String  s = scaner.nextLine();
            System.out.println(s);
            scaner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
