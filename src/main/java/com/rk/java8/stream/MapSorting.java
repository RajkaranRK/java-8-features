package com.rk.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("raj","karan","pintu","rajkaran","prajapati","rajkaran2");
        Map<String,String> unsortedMap = names.stream().collect(Collectors.toMap(name -> name, Function.identity()));
        sortMap(unsortedMap);
    }


    private static void sortMap(Map<String,String> unsortedMap){
        System.out.println("Before sorting");
        unsortedMap.entrySet().forEach(System.out::println);
        unsortedMap = unsortedMap.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, TreeMap::new));
        System.out.println("After sorting");
        unsortedMap.entrySet().forEach(System.out::println);
    }
}
