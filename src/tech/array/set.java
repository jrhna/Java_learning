package tech.array;

import java.net.Inet4Address;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        HashSet <Integer> set1= new HashSet<>();// phan tu ngau nhien, khong co thu tu
       // HashSet<Integer> set2= new LinkedHashSet<>();// theo thu tu them vao -> dem so phan tu khac nhau
        LinkedHashSet<Integer> set2= new LinkedHashSet<>();
       // TreeSet<Integer> set3 = new TreeSet<>(); // sap xep tang dan
        Set<Integer> set3 = new TreeSet<>(); // sap xep tang dan
        int []a ={70,100,9,4,1,3,4,6,7,2,3,1};
        int []b ={1,3,4,6,7,2,3,1,5};
        int []c ={100,9,4,1,3,4,6,7,2,3,1,5};

        for (int x: a
             ) {
            set.add(x);
        }
        System.out.println(set.size());
        set.remove(1);
        set.remove(5000);// nếu remove kí tự ko có -> aborted called, segmentation fault, runtime error
        System.out.print("HashSet:");
        for (int x: set
        ) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x: b
        ) {
            set2.add(x);
        }
        System.out.print("LinkedHashSet:");
        for (int x: set2
        ) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x:c
             ) {
            set3.add(x);
        }
        System.out.print("TreeSet: ");
        for (int x:set3
             ) {
            System.out.print(x + " ");
        }


//        add() Thêm phần tử vào set
//        remove() Xóa phần tử khỏi set
//        size() Trả về số lượng phần tử trong set
//        contains() Kiểm tra sự tồn tại của 1 phần tử trong set
//        clear() Xóa mọi phần tử trong set
//        isEmpty() Trả về true nếu set rỗng, ngược lại trả về false

    }
}
