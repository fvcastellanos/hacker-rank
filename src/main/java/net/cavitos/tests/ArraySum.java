package net.cavitos.tests;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int total = 0;

        for (int value : ar) {
            total += value;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }

}
