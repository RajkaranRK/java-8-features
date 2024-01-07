package com.rk.java8.thread;

public class MyThreadExample {
    public static void main(String[] args) throws InterruptedException {
        joinExample();
    }

    private static void yieldExample(){
        Runnable r1 = () -> {
            for(int i =0; i<10; i++){
                System.out.println("t1:"+i);
                System.out.println("yield t1");
                Thread.yield();
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println("error comes while sleeping the thread");
                }
            }
        };

        Runnable r2 = () -> {
            for(int i =0; i<10; i++){
                System.out.println("t2:"+i);
                System.out.println("yield t2");
                Thread.yield();
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println("error comes while sleeping the thread");
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }


    private static void joinExample() throws InterruptedException{
        Runnable r1 = () -> {
            for(int i =0; i<5; i++){
                System.out.println("t1:"+i);
                System.out.println("join t1");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println("error comes while sleeping the thread");
                }
            }
        };

        Runnable r2 = () -> {
            for(int i =0; i<5; i++){
                System.out.println("t2:"+i);
                System.out.println("join t2");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println("error comes while sleeping the thread");
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();

    }
}