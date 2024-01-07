package com.rk.java8.thread;

public class Producer implements Runnable{

    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try{
            while (true){
                sharedBuffer.produce();
                Thread.sleep(1000); // Simulate some work
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
