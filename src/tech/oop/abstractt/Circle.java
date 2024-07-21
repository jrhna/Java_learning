package tech.oop.abstractt;

public class Circle extends GeometricObject{
    private double radius;
    public Circle (String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }


}
