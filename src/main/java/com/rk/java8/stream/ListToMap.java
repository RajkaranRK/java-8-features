package com.rk.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {


    public static void main(String[] args) {
        //convert list to map of names i.e. string
        List<String> names = Arrays.asList("Raj","Karan","Rajkaran");
        Map<String,String> nameMap = names.stream().collect(Collectors.toMap(name -> name, Function.identity()));
        nameMap.entrySet().forEach(System.out::println);

        //convert list to map of employee object
        List<Employee> employees = new ArrayList<>();
        populateEmployeeList(employees);
        Map<String,Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getName,Function.identity()));
        employeeMap.entrySet().forEach(System.out::println);
    }


    public static void populateEmployeeList(List<Employee> employees){
        employees.add(new Employee(1,12,1000,"First"));
        employees.add(new Employee(2,12,1000,"Second"));
        employees.add(new Employee(3,40,2000,"Third"));
    }
}
