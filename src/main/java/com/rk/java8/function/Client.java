package com.rk.java8.function;

import java.util.function.Function;

public class Client {

    public static void main(String []args){


        Function<String,Integer> strLenFunction = str -> str.length();
        Function<Integer,Boolean> evenFuntion = len -> len % 2 == 0;

        System.out.println(strLenFunction.apply("Rajkaran"));

        System.out.println("Is it even length ? using andThen : "+strLenFunction.andThen(evenFuntion).apply("Rajkaran"));


        System.out.println("Is it even length ? using compose :"+evenFuntion.compose(strLenFunction).apply("Rajkaran"));


    }
}
