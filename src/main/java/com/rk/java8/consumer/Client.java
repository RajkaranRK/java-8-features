package com.rk.java8.consumer;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Client {

    public static void main(String[] args) {
        Consumer<String> printLog = System.out::println;
        printLog.accept("Rajkaran");

        Consumer<String> printLen = str -> System.out.println(str.length());

        printLen.andThen(printLog).accept("Rajkaran");
    }
}
