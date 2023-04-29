package com.rk.java8.predicate;

import java.util.function.Predicate;

public class Client {


    public static void main(String[] args) {

        Predicate<String> evenPredicate = str -> str.length() % 2 == 0;
        Predicate<String> startPredicate = str -> str.startsWith("R");

        System.out.println(evenPredicate.test("Rajkaran"));
        System.out.println(evenPredicate.test("Raj"));
        System.out.println(evenPredicate.and(startPredicate).test("Rajkaran"));
        System.out.println(evenPredicate.or(startPredicate).test("Raj"));
    }


}
