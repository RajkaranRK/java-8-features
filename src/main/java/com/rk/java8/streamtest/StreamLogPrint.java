package com.rk.java8.streamtest;

import java.util.stream.IntStream;

public class StreamLogPrint {

    public static void main(String[] args) {
        IntStream.range(1,10).map(num -> {
            System.out.println(num);
            return num;
        }).filter(num -> {
            if(num % 2== 0){
                System.out.println("Even");
                return true;
            }else{
                System.out.println("odd");
                return false;
            }
        }).forEach(System.out::println);
    }
}
