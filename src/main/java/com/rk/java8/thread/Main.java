package com.rk.java8.thread;

public class Main {

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        Thread producer = new Thread(new Producer(sharedBuffer));
        Thread consumer = new Thread(new Consumer(sharedBuffer));
        producer.start();
        consumer.start();
    }
}
