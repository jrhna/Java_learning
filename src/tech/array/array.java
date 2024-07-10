package tech.array;

public class array {
    public static void main(String[] args) {
        int[] a = new int[100];
        char[] ten = new char[50];
        int[] b =  {1,2,3};
        char [] nameArray= {'h','o','w','K','t','e','a','m'};
        System.out.println(nameArray);

        //two dimensional array
        int [][] arr= new int [3][5];
        System.out.println(arr);
        //Print array
        System.out.println("Print array");
        for (int k:b) {
            System.out.println(k);
        }
        System.out.println("Done!");

        System.out.println(a[0]);
        int [][] ar = {{1,2,3},{2,3},{1,2,3}};
        System.out.println(ar); // in ra dia chi

    }
}
