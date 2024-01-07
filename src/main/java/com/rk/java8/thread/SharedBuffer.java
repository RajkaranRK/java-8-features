package com.rk.java8.thread;

import java.util.LinkedList;

public class SharedBuffer {

    private LinkedList<Integer> buffer = new LinkedList<>();
    private static final int BUFFER_SIZE = 5;

    public void produce() throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == BUFFER_SIZE) {
                // Buffer is full, wait for the consumer to consume
                wait();
            }

            // Produce an item and add it to the buffer
            int item = (int) (Math.random() * 100);
            buffer.add(item);
            System.out.println("Produced: " + item);

            // Notify the consumer that an item is available
            notify();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                // Buffer is empty, wait for the producer to produce
                wait();
            }

            // Consume an item from the buffer
            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);

            // Notify the producer that a space is available in the buffer
            notify();
        }
    }
}
