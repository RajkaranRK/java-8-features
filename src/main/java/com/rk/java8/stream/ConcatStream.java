package com.rk.java8.stream;

import java.util.stream.Stream;

public class ConcatStream {

    public static void main(String[] args) {
        Stream<Integer> numStream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> numStream2 = Stream.of(6,7,8,9);
        Stream.concat(numStream1,numStream2).forEach(System.out::println);
    }
}
