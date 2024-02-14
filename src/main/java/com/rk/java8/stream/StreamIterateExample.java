package com.rk.java8.stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        printFibonacci(10);
        printFibonacci2(100);

        Integer sum = Stream.iterate(0,n->n+2).limit(100).reduce(Integer::sum).get();
        System.out.println(sum);
        sum = Stream.iterate(0,n->n+2).limit(100).mapToInt(n->n).sum();
        System.out.println(sum);
    }

    private static void printFibonacci(int n){
        Stream.iterate(new int[]{0,1},arr -> new int[]{arr[1],arr[0]+arr[1]})
                .limit(n)
                .map(arr -> arr[0])
                .forEach(System.out::println);
    }


    private static void printFibonacci2(int tillNumber){
        Stream.iterate(new int[]{0,1},arr -> arr[0] < tillNumber, arr -> new int[]{arr[1],arr[0]+arr[1]})
                .map(arr -> arr[0])
                .forEach(System.out::println);
    }
}
