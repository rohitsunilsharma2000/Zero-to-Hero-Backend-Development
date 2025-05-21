package org.example.thread;

 class Counter {

    private int count = 0;

    public synchronized void increment () {
        count = count + 1;
    }

    public int getCount () {
        return count;
    }
}


public class SynchronizedDemo{
    public static void main ( String[] args ) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread (()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });


        Thread thread2 = new Thread (() ->{
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });


        Thread thread4 = new Thread (()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });


        Thread thread3 = new Thread (() ->{
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Final count: " + counter.getCount() );


    }
}