package com.rk.java8.streamtest;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        Stream.iterate(new int[]{0,1},fib -> new int[]{fib[1],fib[0]+fib[1]})
                .map(fib -> fib[0])
                .limit(n)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0,1},fib -> new int[]{fib[1],fib[0]+fib[1]})
                .map(fib -> fib[0])
                .limit(n)
                .skip(n-1)
                .forEach(System.out::println);

        String series = Stream.iterate(new int[]{0,1},fib -> new int[]{fib[1],fib[0]+fib[1]})
                .map(fib -> String.valueOf(fib[0]))
                .limit(n)
                .collect(Collectors.joining(","));
        System.out.println(series);

        int sum = Stream.iterate(new int[]{0,1},fib -> new int[]{fib[1],fib[0] + fib[1]})
                .map(fib -> fib[0])
                .limit(n)
                .reduce(0,(a,b) -> a+b);
        System.out.println(sum);
        sum = IntStream.range(0,n).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
