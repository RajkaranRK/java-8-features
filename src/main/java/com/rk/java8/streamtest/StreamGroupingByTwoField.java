package com.rk.java8.streamtest;

import com.rk.java8.stream.Employee;
import com.rk.java8.stream.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByTwoField {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateStudent(employees);
        Map<Integer, Map<Integer,List<Employee>>> empGroup = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.groupingBy(Employee::getSalary)));

        Map<Tuple,List<Employee>> empGroup2 = employees.stream().collect(Collectors.groupingBy(emp -> new Tuple(emp.getSalary(),emp.getAge())));

        System.out.println(empGroup);
        System.out.println(empGroup2);
    }

    private static void populateStudent(List<Employee> employees){
        employees.add(new Employee(1,12,1000,"raj"));
        employees.add(new Employee(2,12,1000,"karan"));
        employees.add(new Employee(3,12,10000,"rajkaran"));
    }

}
