package com.rk.java8.lamda;

@FunctionalInterface
public interface Calculator {

    int calculate(int a,int b);

    default void someDefaultMethod(){
        System.out.println("some default method");
    }

    static void someStaticMethod(){
        System.out.println("some static method");
    }
}
