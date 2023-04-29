package com.rk.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client {

    public static void main(String []args){
        printSequenceOfNumber(10);
        printEvenNumbers(100);
        toUpperCase();
    }


    private static void printSequenceOfNumber(int n){
        IntStream.range(1,n+1).forEach(System.out::println);
    }

    private static void printEvenNumbers(int n){
        List<Integer> evenStream = IntStream.range(1,n+1).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());
        evenStream.forEach(System.out::println);
    }

    private static void toUpperCase(){
        List<String> versions = Arrays.asList("Java 7", "Java 8", "Java 9", "Java 10");
        versions.stream().map(version -> version.toUpperCase()).forEach(System.out::println);
    }
}
