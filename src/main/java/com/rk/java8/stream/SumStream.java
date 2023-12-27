package com.rk.java8.stream;

import java.util.stream.IntStream;

public class SumStream {

    public static void main(String[] args) {
        int sum = IntStream.range(1,11).sum();
        System.out.println(sum); // sum of n natural number
        sum = IntStream.range(1,11).filter(num -> num %2 == 0).sum();
        System.out.println(sum); // sum of n even number
        IntStream.range(1,11).forEach(System.out::println); // print n numbers

        /*
        int sum2 = 0;
        IntStream.range(1,11).forEach(num -> sum2 = sum2+num);
         */
        //This is the problem sum2 variable need to be final or inorder to avoid it you can use reduce
        sum = IntStream.range(1,11).reduce(0,(a,b) -> a+b);
        System.out.println(sum);

    }
}
