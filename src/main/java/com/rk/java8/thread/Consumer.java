package com.rk.java8.thread;

public class Consumer implements Runnable{

    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try{
            while (true){
                sharedBuffer.consume();
                Thread.sleep(1500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
