package tech.array;

import java.sql.SQLOutput;
import java.util.*;

public class arrayList
{
    public static void main(String[] args) {
            ArrayList <Integer> a = new ArrayList<>();
            List<Integer> arr= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        //Hàm add(): Thêm 1 phần tử vào cuối của Array List vd: arr.add(1) -> thêm 1 vào cuối mảng
        //Nhập 1 mảng và lưu vào array list:
        for (int i=0; i<n;i++){
            int temp=sc.nextInt();
            a.add(temp);
        }
        //Duyet mang
        //Ham size: trả về kích thước mảng
        // get(): chỉ trả về chị số của mảng
        //indexOf (): trả về chị số index,Trả về chỉ số đầu tiên của 1 phần tử nếu nó xuất hiện trong
        //array list, trả về -1 nếu phần tử này không xuất hiện.

        for (int i  = 0 ;i < a.size() ; i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println("\nIndex");
        for (int i  = 0 ;i < a.size() ; i++){
            System.out.print(a.indexOf(i) + " ");
        }
        System.out.println("\nFor each: ");
        for (int x:a) {
            System.out.print(x + " ");
        }
        System.out.println();
        // set(): Thay đổi giá trị
        a.set(2,100); // set tại index 2 change -> 100;
        System.out.println("after change value tai chi so 2: ");
        for (int x:a) {
            System.out.print(x + " ");
        }
        //contains(<giatri>): trả về true false Kiểm tra sự tồn tại của một giá trị trong array list.
        System.out.println("\nmang co chua so 2 khong? " + a.contains(2));
        //Hàm remove(index): Xóa 1 phần tử khỏi chỉ số index.
        //Hàm remove(object): Xóa 1 phần tử thông qua giá trị, nếu array list chứa nhiều phần tử object, hàm này chỉ xóa vị trí đầu tiên.
        a.remove(3);
        System.out.println("remove tai chi so 3");
        for (int x:a
             ) {
            System.out.print(x + " ");
        }
        System.out.println("\nadd: 500");
        a.add(500);
        for (int x:a) {
            System.out.print(x + " ");
        }
        System.out.println("\nremove gia tri 2");
        a.remove((Object)2);
        for (int x:a
        ) {
            System.out.print(x + " ");
        }
        System.out.println("\nsort: ");
        //Sort
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("Collections.sort: giam");
        for (int x:a) {
            System.out.print(x + " ");
        }
        //sort: a.sort
        a.sort(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("\na.sort: tang");
        a.forEach((e) -> System.out.print(e + " "));
//        Hàm toArray(): Trả về mảng chứa các object tương tự như trong array list.
        System.out.println("\ntoArray");
        Object[] b = a.toArray();
        for(Object x : b)
            System.out.print(x + " ");
//Hàm forEach(): Cung cấp một áp dụng hàm nào đó với lần lượt các phần tử trong array list.
        System.out.println();
        a.forEach((p) -> System.out.print(p + " "));
//        Hàm clear(): Xóa toàn bộ các phần tử trong array list.
//        Hàm isEmpty(): Kiểm tra array list rỗng.
        a.clear();
        System.out.print("isEmpty: " + a.isEmpty());
    }
}
