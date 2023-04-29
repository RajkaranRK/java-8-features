package com.rk.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        List<String> versions = Arrays.asList("Java 7","Java 8","Java 9","Java 10","Java 11","Java 12");
        List<String> updated = versions.stream().flatMap(version -> Stream.of(version,version.toUpperCase(),version.toLowerCase()))
                .collect(Collectors.toList());
        updated.forEach(System.out::println);


        List<List<Integer>> numbers = new ArrayList<>();
        numbers.add(Arrays.asList(1,2));
        numbers.add(Arrays.asList(3,4));
        numbers.add(Arrays.asList(5,6));
        numbers.add(Arrays.asList(7,8));
        numbers.add(Arrays.asList(9,10));
        numbers.add(Arrays.asList(11,12));
        List<Integer> flatList = numbers.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        flatList.forEach(System.out::println);
    }
}
