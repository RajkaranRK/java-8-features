package com.rk.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployeeList(employees);
        System.out.println("before sorting ");
        System.out.println(employees);
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingInt(Employee::getId).thenComparingInt(Employee::getSalary)).collect(Collectors.toList());

        System.out.println("After sorting ");
        System.out.println(employees);

        System.out.println("After sorting ");
        System.out.println(sortedEmployees);
    }


    public static void populateEmployeeList(List<Employee> employees){
        employees.add(new Employee(3,12,1100,"Fourth"));
        employees.add(new Employee(3,12,1000,"Third"));
        employees.add(new Employee(1,12,1000,"First"));
        employees.add(new Employee(2,40,2000,"Second"));
    }
}
