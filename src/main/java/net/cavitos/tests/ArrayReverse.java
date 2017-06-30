package net.cavitos.tests;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        String output = toSpaceString(toReversedArray(n, ar));
        System.out.println(output);
    }

    private static String toSpaceString(int [] numbers) {

        StringBuffer sf = new StringBuffer();
        for (int number : numbers) {
            sf.append(number).append(" ");
        }

        sf.replace(sf.length() - 1, sf.length() - 1, "");

        return sf.toString();
    }

    private static int [] toReversedArray(int size, int [] number) {

        int [] numbers = new int[size];

        int i = size - 1;
        for (int n : number) {
            numbers[i] = n;
            i--;
        }

        return numbers;
    }
}
