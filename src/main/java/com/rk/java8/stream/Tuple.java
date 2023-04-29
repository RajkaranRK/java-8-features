package com.rk.java8.stream;

import java.util.Objects;

public class Tuple {

    int salary;
    int age;

    public Tuple(int salary, int age){
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple)) return false;
        Tuple tuple = (Tuple) o;
        return getSalary() == tuple.getSalary() && getAge() == tuple.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalary(), getAge());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "salary=" + salary +
                ", age=" + age +
                '}';
    }
}
