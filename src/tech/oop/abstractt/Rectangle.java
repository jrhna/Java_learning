package tech.oop.abstractt;

public class Rectangle extends GeometricObject{
    private double width, height;
    public Rectangle(String color, boolean filled, double width, double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea (){
        return this.width*this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
}
