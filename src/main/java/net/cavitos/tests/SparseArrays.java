package net.cavitos.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SparseArrays {


    private static int sequenceCounter(List<String> list, String st) {

        return list.stream()
                .mapToInt(x -> {
                    return st.equals(x)?1:0;
                }).sum();
/*
        return list.stream()
                .mapToInt(x -> {
                    int value = 0;
                    String str = x;
                    int index = str.indexOf(st);
                    while(index > -1) {
                        str = str.replaceFirst(st, "");
                        value ++;
                        index = str.indexOf(st);
                    }

                    return value;
                }).sum();
*/
    }

    private static List<Integer> countQueryMatches(List<String> strings, List<String> queries) {
        return queries.stream()
            .map(x -> {
                return sequenceCounter(strings, x);
            }).collect(Collectors.toList());
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        List<String> list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            list.add(scanner.next());
        }

        int queries = scanner.nextInt();
        List<String> q = new ArrayList<>(num);

        for (int i = 0; i < queries; i++) {
            q.add(scanner.next());
        }

        List<Integer> matches = countQueryMatches(list, q);

        matches.stream()
                .forEach(System.out::println);
    }

}
