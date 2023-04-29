package com.rk.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployeeList(employees);
        Optional<Integer> salarySum = employees.stream().map(Employee::getSalary).reduce((e1, e2)->e1+e2);
        System.out.println(salarySum.get());
    }

    public static void populateEmployeeList(List<Employee> employees){
        employees.add(new Employee(1,12,1000,"First"));
        employees.add(new Employee(2,12,1000,"Second"));
        employees.add(new Employee(3,40,2000,"Raj"));
    }
}
