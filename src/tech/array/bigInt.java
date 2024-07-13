package tech.array;

import java.math.BigInteger;

public class bigInt {
    public static void main(String[] args) {
        String s1 = "18238128381283812381123123123123";
        String s2 = "192399239192393";
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));
    }
}
