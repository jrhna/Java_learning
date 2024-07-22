package tech.oop.constructor;

import java.sql.Types;

public class SinhVien {
    private int id;
    private String name;
    private double gpa;
    public SinhVien(){
        id= Types.NULL;
        name="";
        gpa = 0;
    }
    public SinhVien (int id, String name, double gpa){
        this.id=id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getName (){
        return this.name;
    }
    public double getGpa(){
        return this.gpa;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0 &&  gpa < 4 )
        this.gpa = gpa;
        else System.out.println("Error gpa");
    }
    public String toString (){
        return this.id + " " + this.name + " " + this.gpa;
    }


}
