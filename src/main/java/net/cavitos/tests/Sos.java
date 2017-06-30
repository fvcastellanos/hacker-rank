package net.cavitos.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sos {

    private static List<String> splitString(String str) {
        int messages = str.length() / 3;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < messages; i++) {
            list.add(str.substring(i * 3, (i * 3) + 3));
        }

        return list;
    }

    private static long countLetters(String str) {

        List<String> list = splitString(str);

        long chars =
                list.stream()
                    .filter(st -> {
                        return !"SOS".equals(st);
                    })
                    .mapToInt(st -> {
                        int count = Character.compare('S', st.charAt(0))==0?0:1;
                        count += Character.compare('O', st.charAt(1))==0?0:1;
                        count += Character.compare('S', st.charAt(2))==0?0:1;

                        return count;
                    }).asLongStream().sum();

        return chars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        long count = countLetters(S);

        System.out.println(count);
    }

}
