package tech.gui.studentlist;

import java.security.PublicKey;

public class Student {
    private String id;
    private String name;
    private String className;
    private double gpa;
    public Student(){
        id ="";
        name ="";
        className ="";
        gpa = 0;
    }
    public Student(String id, String name, String className, double gpa){
        this.id = id;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double GPA) {
        this.gpa = GPA;
    }
}
