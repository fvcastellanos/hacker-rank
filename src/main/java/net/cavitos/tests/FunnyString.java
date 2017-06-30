package net.cavitos.tests;

import java.nio.charset.Charset;
import java.util.Scanner;

public class FunnyString {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

    static String funnyString(String s){
        byte [] chars = s.getBytes(Charset.forName("ASCII"));

        int len = chars.length;
        int j = len - 2;

        boolean funny = true;
        for (int i = 1; i < len; i++)
        {
            int a = Math.abs(chars[i] - chars[i - 1]);
            int b = Math.abs(chars[j] - chars[j + 1]);

            if (a != b) {
                funny = false;
                break;
            }

            j--;
        }

        return funny?"Funny":"Not Funny";
    }

}
