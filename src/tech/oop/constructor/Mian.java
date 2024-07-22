package tech.oop.constructor;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {

        SinhVien sv1= new SinhVien();
        SinhVien sv2 =new SinhVien(1,"Anh",5.0);
        System.out.println(sv2);
        sv2.setGpa(6.8);

        // clone
        System.out.println("clone");

            Clone a = new Clone();
            int[] mang = {1,2,3};
            int[] arr = {1,2,3};
            a.setArray(mang);
            a.displayArray();
            mang[1] = 3;
            a.displayArray();
        System.out.println("gia tri cua mang bij thay doi");
        System.out.println("xu dung phuong thuc clone");
        a.setArrayClone(arr);
        a.setArrayClone(arr);
        a.displayArray();
        arr[1]=3;
        a.displayArray();
        System.out.println(Arrays.toString(a.getArray()));
        for (int i : a.getArray()) {
            System.out.print(i +  " ");
        }
        System.out.println();
        System.out.println("Person:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Age: ");
        int age=sc.nextInt();

        System.out.print("Height: ");
        double height=sc.nextDouble();
        Person ps1= new Person(name, age,height);
        System.out.println( ps1.toString());
        ps1.getInfo();

//Lưu ý: Riêng với kiểu dữ liệu String, mặc dù là kiểu dữ liệu tham chiếu.
// Tuy nhiên, String có cơ chế là khi thay đổi giá trị thì nó bàn chất nó đang tạo ra một đối tượng String mới.
// Vì vậy, như các kiểu dữ liệu nguyên thủy, bạn có thể làm phương thức getter và setter bình thường.
    }
}
