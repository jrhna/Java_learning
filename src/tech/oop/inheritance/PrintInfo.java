package tech.oop.inheritance;
//Cha có thì con có, con có chưa chắc cha đã có”

public class PrintInfo {
    public static void main(String[] args) {
        Person ps1 = new Person("Anh", 20, 45.5f);
        ps1.getInfo();
        Student st1 = new Student("kaka", 6, 9.9f, "CTU");
        st1.getInfo();
        st1.printUniversity();
    }
}
