package net.cavitos.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    private static String toSpaceString(List<Integer> numbers) {

        final StringBuffer sf = new StringBuffer();
        for (int number : numbers) {
            sf.append(number).append(" ");
        }

        sf.replace(sf.length() - 1, sf.length() - 1, "");

        return sf.toString();
    }

    private static List<Integer> rotateN(int n, Integer [] arr) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        for (int i = 0; i < n; i++) {
            Integer head = list.get(0);
            list.remove(0);
            list.add(head);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        Integer[] ar = new Integer[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        String output = toSpaceString(rotateN(r, ar));
        System.out.println(output);
    }

}
