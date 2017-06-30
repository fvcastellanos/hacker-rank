package net.cavitos.tests;

import java.math.BigInteger;
import java.util.*;

public class SuperDigit {

    private static Map<Character, Integer> numberMap;

    private static String sumDigit(String number) {
        long superValue = 0;

        for (Character c : number.toCharArray()) {
            superValue += Integer.parseInt(c.toString());
        }

        return Long.toString(superValue);
    }

    private static String superDigit(String number, int n) {

        if (number.length() == 1) {
            return number;
        }

        BigInteger bi = new BigInteger(number);
        BigInteger ev = bi.multiply(new BigInteger(Integer.toString(n)));

        return superDigit(sumDigit(ev.toString()), 1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String k = in.next();

        String sd = superDigit(n, Integer.parseInt(k));

        System.out.println(sd);
    }

}
