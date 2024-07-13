package tech.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class stringTokenizer {
    public static void main(String[] args) {
        String s = "java learning     string!!!";
        StringTokenizer stringToken = new StringTokenizer(s);

        ArrayList<String> arr = new ArrayList<>();

        while (stringToken.hasMoreTokens()){
            arr.add(stringToken.nextToken());
        }
        System.out.println(arr);
        System.out.println();
        for (String x: arr){
            System.out.println(x);
        }
        System.out.println("hashset");
        Set<String> set =new HashSet<>();
        for ( String x: arr){
            set.add(x);
        }
        System.out.println(set.size());
    }
}
