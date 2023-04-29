package com.rk.java8.methodreference.instRef;

import com.rk.java8.methodreference.abstraction.CalculatorInterface;

public class Client {

    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String []args){
        Client client = new Client();

        CalculatorInterface calculator = client::multiply;
        System.out.println(calculator.calculate(10,20));
    }
}
