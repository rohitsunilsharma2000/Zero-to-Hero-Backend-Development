package org.example.thread;


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running via Thread class");
    }

    public static void main ( String[] args ) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
        System.out.println("Main method running");
    }
}
