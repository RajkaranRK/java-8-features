package com.rk.java8.methodreference.staticref;

import com.rk.java8.methodreference.abstraction.CalculatorInterface;
import com.rk.java8.methodreference.abstraction.Message;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Client {

    public static void printEncryptedMessage(String msg){
        System.out.println(new String(Base64.getEncoder().encode(msg.getBytes()), StandardCharsets.UTF_8));
    }
    public static void main(String []args){
        Message msg = Client::printEncryptedMessage;
        msg.print("Rajkaran");

        CalculatorInterface calculator = Client::add;

        System.out.println(calculator.calculate(10,20));
    }


    public static int add(int a,int b){
        return a + b;
    }
}
