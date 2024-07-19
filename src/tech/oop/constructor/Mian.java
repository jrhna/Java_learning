package tech.oop.constructor;

import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {

        SinhVien sv1= new SinhVien();
        SinhVien sv2 =new SinhVien(1,"Anh",5.0);
        System.out.println(sv2);
        sv2.setGpa(6.8);
    }
}
