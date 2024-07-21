package tech.oop.abstractt;

public class Main {

    public static boolean equalArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea() == o2.getArea();
    }

    public static void display(GeometricObject o){
        System.out.println(  String.format("%.2f",o.getArea()) + " "  + String.format("%.2f",o.getPerimeter()));
    }

    public static void main(String[] args) {
        GeometricObject re = new Rectangle("while", false, 4, 5);
        Circle circle =new Circle("red",true,6.5);
        display(circle);
        display(re);
        System.out.println(equalArea(re,circle));
    }


}
