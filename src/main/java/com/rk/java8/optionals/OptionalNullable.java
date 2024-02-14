package com.rk.java8.optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalNullable {

    public static void main(String[] args) {
        String received = Optional.ofNullable(args.length == 0 ? null : args[0])
                .orElse("default");
        System.out.println("received string "+received);
    }
}
