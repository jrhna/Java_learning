package tech.oop.constructor;

public class Person {
    public String name;
    private int age;
    public double height;
    public Person (String name, int age, double height){
        this.name =  name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if (age>=0 ) {
            this.age = age;
        }
    }

    public int getAge() {
            return this.age;
    }
    @Override
    public Person clone(){
      //  Person other = new Person(this.name, this.age, this.height);
        return new Person(this.name, this.age, this.height);
    }
    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }
    public String toString (){
        return this.name + " " + this.age + " " + String.format("%.2f", this.height) ;
    }

}
