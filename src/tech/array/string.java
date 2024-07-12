package tech.array;

import java.util.Scanner;
import java.util.StringTokenizer;

//String trong Java một khi đã khai báo
//bạn không thể thay đổi nó, vì thế các
//hàm của String đều trả về 1 xâu kí tự mới
//sau khi áp dụng các hàm.
public class string {
    public static void main(String[] args) {
        //Hàm length(): Trả về số kí tự trong xâu
        //Hàm charAt(): String tương tự như mảng, chỉ số bắt đầu từ 0,
        //          hàm charAt(index) trả về kí tự ở chỉ số index
        Scanner sc =new Scanner(System.in);
        String stringName = "Le Thi";
        System.out.println(stringName);
        int age = sc.nextInt();
        sc.nextLine(); /// doc phim enter thua
        String lastName = sc.nextLine();
        System.out.println(age);
        System.out.println(lastName);
        System.out.println("Duyệt từng kí tự");
        for ( int i =0; i< lastName.length(); i++){
            System.out.println(lastName.charAt(i));
        }
        System.out.println("chuyen tu string sang char array");
        for (char x: lastName.toCharArray()){
            System.out.print( x + " ");
        }
        System.out.println();
        System.out.println(lastName.toCharArray());
        //Hàm toUpperCase(): Trả về xâu ở dạng in hoa, hàm này không thay đổi xâu ban đầu
        //Hàm toLowerCase(): Trả về xâu ở dạng in thường, hàm này không thay đổi xâu ban đầu
        System.out.println("In hoa, in thuong");
        String t= lastName.toUpperCase();
        System.out.println(t);
        t=t.toLowerCase();
        System.out.println(t);
        //Hàm concat(): Hàm concat() nối xâu kí tự khác vào cuối xâu hiện tại, bạn có thể sử dụng toán tử + để làm chức năng tương tự.
        String fullName = stringName + " " + lastName;
        t=stringName.concat(t);
        System.out.println("full name : " + fullName);
        System.out.println(t);
        String compare1 = "java 28tech";
        String compare2 = "java 28TECH";
        //Hàm compareTo(): so sánh 2 xâu theo thứ tự từ điển, nếu 2 xâu bằng nhau trả về 0,
        //          trả về số âm nếu xâu hiện tại nhỏ hơn xâu cần so sánh, ngược lại trả về số dương.
        //Hàm compareToIgnoreCase(): sẽ bỏ qua in hoa in thường khi so sánh.
        System.out.println(compare1.compareTo(compare2));
        System.out.println(compare1.compareToIgnoreCase(compare2));
        System.out.println(" so sanh su dung equals");
        if(compare2.equals("java 28")) {
            System.out.println("YES");
        } else System.out.println("NO");
        System.out.println("equalsIgnoreCase");
        if(compare2.equalsIgnoreCase(compare1)) {
            System.out.println("YES");
        } else System.out.println("NO");
        //Hàm substring(): trả về xâu con
        System.out.println(fullName.substring(3,7));
        //Hàm contains(): Kiểm tra sự tồn tại của xâu con
        System.out.println("full name co chứa họ lê: " + fullName.contains("le"));
        // Tách các từ trong xâu: Sử dụng hàm split và regex
                    //split: Để tách các từ trong xâu theo dấu cách ta sử dụng hàm, hàm này trả về 1 mảng chứa các từ trong xâu.
        String splitString = "learning      java    !!";
        String [] arr = splitString.split("\\s+");
        for ( String x: arr) System.out.println(x);
        //Sử dụng lớp StringTokenizer
        System.out.println("Sử dụng lớp StringTokenizer");
        StringTokenizer st = new StringTokenizer(splitString);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        //lớp Character
        //isDigit(char c) Kiểm tra chữ số
        //isLowerCase (char c) Kiểm tra chữ in thường
        //isUpperCase(char c) Kiểm tra in hoa
        //isAlphabetic(char c) Kiểm tra chữ cái
        //char toLower(char c) Chuyển thành chữ in thường
        //char toUpper(char c) Chuyển thành chữ in hoa
    }
}
