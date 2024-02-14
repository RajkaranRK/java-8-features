package com.rk.java8.thread.pubsub;

import java.util.concurrent.LinkedBlockingQueue;

public class CharacterProducer implements Runnable {


    private LinkedBlockingQueue<Character> sharedQueue;

    private static final int MAX_SIZE = 5;

    CharacterProducer(LinkedBlockingQueue<Character> sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        String name = "RajkaranPrajapati";
        synchronized (sharedQueue){
            try{
                for (Character character : name.toCharArray()){
                    if(sharedQueue.size() == MAX_SIZE){
                        sharedQueue.wait();
                    }
                    System.out.println("Character produced: "+character);
                    sharedQueue.add(character);
                    sharedQueue.notify();
                }
            }catch (Exception e){
                System.out.println("Error while producing "+e.getMessage());
            }
        }
    }
}
