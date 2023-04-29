package com.rk.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Client {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("Rajkaran");
        System.out.println(supplier.get());
    }
}
