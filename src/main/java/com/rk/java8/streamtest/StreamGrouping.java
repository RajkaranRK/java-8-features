package com.rk.java8.streamtest;

import com.rk.java8.stream.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateStudent(employees);
        Map<Integer, List<Employee>> ageMap = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(ageMap);
    }


    private static void populateStudent(List<Employee> employees){
        employees.add(new Employee(1,12,1000,"raj"));
        employees.add(new Employee(2,22,1000,"karan"));
        employees.add(new Employee(3,12,10000,"rajkaran"));
    }
}
