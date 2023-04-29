package com.rk.java8.stream;
import java.util.*;
import java.util.stream.Collectors;


public class StreamGroupExample {

    public static void main(String []args){
        List<Employee> employees = new ArrayList<>();
        populateEmployeeList(employees);
        printLineSep();
        int sum = findSumSalary(employees);
        System.out.println("Sum of salary "+sum);
        printLineSep();


        Map<Tuple,List<Employee>> map = groupByTwoFields(employees);
        System.out.println(map);
        printLineSep();

        Map<Integer,Integer> groupByAgeAndSumSalary = groupAndSum(employees);
        System.out.println(groupByAgeAndSumSalary);
        printLineSep();

    }


    public static Map<Tuple, List<Employee>> groupByTwoFields(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(emp -> new Tuple(emp.getSalary(),emp.getAge())));
    }


    private static int findSumSalary(List<Employee> employees){
        int sum = 0;
        return employees.stream().map(Employee::getSalary).reduce(sum, (e1,e2)->e1+e2);
    }


    public static void populateEmployeeList(List<Employee> employees){
        employees.add(new Employee(1,12,1000,"First"));
        employees.add(new Employee(2,12,1000,"Second"));
        employees.add(new Employee(3,40,2000,"Raj"));
    }

    private static void printLineSep(){
        System.out.println("*******************************");
    }


    private static Map<Integer,Integer> groupAndSum(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.summingInt(Employee::getSalary)));
    }
}


