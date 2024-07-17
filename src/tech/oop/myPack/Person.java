package tech.oop.myPack;

public class Person {
    public String ten;
    public int tuoi;
    private float chieuCao;
     public Person (String name, int tuoi, float chieuCao){
         this.ten = name;
         this.tuoi=tuoi;
         this.chieuCao = chieuCao;
     }
     public void xinChao (){
        System.out.println(ten + " " + "toi " + tuoi +" tuoi");
    }
    public float getChieuCao(){
         return chieuCao;
    }


}
