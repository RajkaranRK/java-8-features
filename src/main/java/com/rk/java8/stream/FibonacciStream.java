package com.rk.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {
        int n = 10;
       Stream.iterate(new int[]{0,1},fib -> new int[]{fib[1] ,fib[0]+fib[1]})
                .map(fib ->fib[0])
                .limit(n)
                .forEach(System.out::println);

       String fib = Stream.iterate(new int[]{0,1} , t -> new int[]{t[1], t[1]+t[0]})
               .map(t -> String.valueOf(t[0]))
               .limit(n)
               .collect(Collectors.joining(","));
       System.out.println(fib);


       //sum of fibonacci number
       int sum = Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
               .map(t -> t[0])
               .limit(n)
               .mapToInt(Integer::intValue)
               .sum();

       System.out.println("Sum :" +sum);


       //find a fibonacci number at perticular position
        long fibonacciAtPosition = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .skip(n - 1)
                .map(t -> t[0])// Skip to the desired position
                .findFirst().get();
        System.out.println(fibonacciAtPosition);


        int num = Stream.iterate(new int[]{0,1}, t -> new int[]{t[1] ,t[1]+t[0]})
                .skip(n-1)
                .map(t -> t[0])
                .findFirst().get();

        System.out.println(num);

    }
}
