package tech.oop.inheritance;

public class Student extends Person {
    //từ khóa super để cho lớp con truy cập các những thứ liên quan đến lớp cha
//    public static String university;
 //   public String university;

//    public Student (String ten,int tuoi, float chieuCao, String tenDaiHoc){
//        super(ten,tuoi,chieuCao);
//       // tenDaiHoc = Student.university;
//        tenDaiHoc = this.university;
//    }
////    public static void printUniversity (){// sao khoong dung dc staiic o day
////        System.out.println("My unversity is " + Student.university);
////    }
//    public  void printUniversity (){
//        System.out.println("My unversity is " + this.university);
//    }
public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:"+this.universityName);
    }
    public  void printUniversity (){
        System.out.println("My unversity is " + this.universityName);
    }
}
