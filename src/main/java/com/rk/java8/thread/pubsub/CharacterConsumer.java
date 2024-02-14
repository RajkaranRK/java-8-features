package com.rk.java8.thread.pubsub;


import java.util.concurrent.LinkedBlockingQueue;

public class CharacterConsumer implements Runnable{

    private LinkedBlockingQueue<Character> sharedQueue;
    public CharacterConsumer(LinkedBlockingQueue<Character> sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try{
            synchronized (sharedQueue){
                while (true){
                    if(sharedQueue.size() == 0){
                        System.out.println("Shared Queue Size is 0");
                        sharedQueue.wait();
                    }
                    Character ch = sharedQueue.poll();
                    System.out.println("Consume character : "+ch);
                    sharedQueue.notify();
                }
            }
        }catch (Exception ex){
            System.out.println("Error while consuming "+ex.getMessage());
        }
    }
}
