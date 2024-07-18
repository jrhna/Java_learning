package tech.oop;

public class StaticBienTinh {

        static String course;

        static {
            System.out.println("HowKteam");//chay truoc
            course = "Java core";
        }

        public static void main(String[] args) {
            System.out.println("Free education");
            System.out.println("course:"+ StaticBienTinh.course);
        }
    }
