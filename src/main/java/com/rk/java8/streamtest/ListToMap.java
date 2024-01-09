package com.rk.java8.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("raj","karan","pintu","rajkaran");
        Map<String,String> nameMap = names.stream().collect(Collectors.toMap(name->name, name->name));
        System.out.println(nameMap);
    }
}
