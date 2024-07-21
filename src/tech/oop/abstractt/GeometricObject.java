package tech.oop.abstractt;



public abstract class GeometricObject { //
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject(){}
    protected GeometricObject(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
