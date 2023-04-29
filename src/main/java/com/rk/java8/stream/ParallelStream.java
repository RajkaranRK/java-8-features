package com.rk.java8.stream;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        normalStream();
        parallelStream();
    }


    public static void normalStream(){
        List<Integer> numbers = getNumbers();
        System.out.println("Start time "+ LocalDateTime.now());
        List<Integer> evens = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("End Time "+LocalDateTime.now());
    }


    public static void parallelStream(){
        List<Integer> numbers = getNumbers();
        System.out.println("Start time "+ LocalDateTime.now());
        List<Integer> evens = numbers.parallelStream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("End Time "+LocalDateTime.now());
    }



    private static List<Integer> getNumbers(){
        return IntStream.range(1,700001).boxed().collect(Collectors.toList());
    }
}
