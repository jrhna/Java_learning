import java.util.Scanner;

public class bai1_2_kieuDuLieu_toanTu_ifElse {
    //psvm: recommend code
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //sout + Enter--> System.out.println(“”)
        System.out.println("Bai 1");
        int a=10;
        int b=4;
        long j=10000000;
        float tong = a/b; // or float a=10;
        float tong1 = (float)a/b;
        float pi=3.2426f;
        double PI=3.14;
        char c='c';
        char d= 65;
        System.out.println("Ki tu d la: " + d);

        System.out.println("gia tri cua a: " + a + " " + (a+b)) ;
        System.out.printf("Gia tri cua pi la: %.2f\n", pi);
        System.out.println("Gia tri a/b la: " + tong);
        System.out.println("Gia tri a/b la: " + tong1);

        //Nhập kí tự
        //Scanner sc= new Scanner(System.in);
//        int k;
//        System.out.print("Nhap vao so nguyen k: ");
//        k= sc.nextInt();
//        System.out.println("Gia tri cua k la: " + k);

        System.out.print("Nhap mot mot cau bat ky: ");
        String chuoiKiTu = sc.nextLine();
        System.out.println("chuoi da nhap la: " + chuoiKiTu);

        System.out.print("Nhap vao ki tu: ");
        char cc = sc.nextLine().charAt(0);
        System.out.println("Ki tu da nhap la: " + cc);

        System.out.print("Nhap vao ki tu thu 2: ");
        char ccc = sc.nextLine().charAt(0);
        System.out.println("Ki tu da nhap la: " + ccc);

        System.out.print("Nhap vao so nguyen: ");
        int so = sc.nextInt();
        System.out.println("Gia tri cua so la: " + so);

        System.out.print("Nhap mot mot cau bat ky thu 2: ");
        String chuoi = sc.nextLine();
        System.out.println("chuoi da nhap la: " + chuoi);
        sc.close();
    }

}
