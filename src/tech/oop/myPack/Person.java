package tech.oop.myPack;

public class Person {
    public String name;
    public int age;
    private float height;
     public Person (String name, int age, float height){
         this.name = name;
         this.age=age;
         this.height = height;
     }
     public void xinChao (){
        System.out.println(name + " " + "toi " + age +" tuoi");
    }
    public float getHeight(){
         return height;
    }


}
