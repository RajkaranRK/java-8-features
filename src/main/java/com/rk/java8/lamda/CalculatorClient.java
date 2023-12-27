package com.rk.java8.lamda;

public class CalculatorClient {

    public static void main(String[] args) {
        Calculator calculator = (a,b) -> a+b;
        System.out.println(calculator.calculate(10,12));
        calculator = (a,b) -> a*b;
        System.out.println(calculator.calculate(10,12));

        calculator = (a,b) -> a - b;
        System.out.println(calculator.calculate(10,12));

        calculator = (a,b) -> a/b;
        System.out.println(calculator.calculate(10,12));
    }
}
