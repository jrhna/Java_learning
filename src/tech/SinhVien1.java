package tech;



public class SinhVien1 {
    private String id;
    private String name;
    private String className;
    private String brith;
    private double gpa;

    public SinhVien1(){
        id ="";
        name ="";
        className ="";
        brith = "";
        gpa = 0;
    }
    public SinhVien1(String ma, String ten, String lop, String ngaysinh, double diem){
        id = ma;
        name = ten;
        className = lop;
        brith = ngaysinh;
        gpa = diem;
    }
    public void chuanhoa(){
        StringBuilder sb = new StringBuilder(brith);
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        brith = sb.toString();
    }
    public void display(){
        System.out.print(id + " " + name + " " + className + " " + brith + " " + gpa  );
//        System.out.printf(" %.1f", gpa);
    }
}
