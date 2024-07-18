package tech.oop;


import tech.oop.myPack.Person;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();

        a.greet();
        System.out.println("Person");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= sc.nextInt();
        Person person1 = new Person("anh", age, 45.5F);
            person1.xinChao();
        float height = person1.getChieuCao();
        System.out.println("Her height: " + height);

    }
}
