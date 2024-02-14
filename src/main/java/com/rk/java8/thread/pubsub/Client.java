package com.rk.java8.thread.pubsub;

import java.util.concurrent.LinkedBlockingQueue;

public class Client {

    public static void main(String[] args) {
        LinkedBlockingQueue<Character> sharedQueue = new LinkedBlockingQueue<>();
        CharacterProducer producer = new CharacterProducer(sharedQueue);
        CharacterConsumer consumer = new CharacterConsumer(sharedQueue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        producerThread.start();
    }
}
