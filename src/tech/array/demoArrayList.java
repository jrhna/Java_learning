package tech.array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class demoArrayList {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 3, 3, 5};
        List<Integer> arr;
        arr = new ArrayList<>();
        for(int x : a){
            arr.add(x);
        }
        arr.forEach((n) -> System.out.print(n + " "));

    }
}
