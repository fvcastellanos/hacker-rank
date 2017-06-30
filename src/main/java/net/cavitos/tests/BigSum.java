package net.cavitos.tests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.*;

public class BigSum {

    static long aVeryBigSum(int n, long[] ar) {

        long sum = 0;
        for (long value : ar) {
            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
