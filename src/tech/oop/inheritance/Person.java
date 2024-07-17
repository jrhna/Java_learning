package tech.oop.inheritance;

public class Person {
    private  String name;//?????
    private final int age;
    private final float height;

    public Person (String name, int age, float height){
        this.name = name;
        this.age= age;
        this.height= height;
    }
    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
