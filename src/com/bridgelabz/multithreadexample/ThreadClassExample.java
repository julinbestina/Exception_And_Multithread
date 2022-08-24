package com.bridgelabz.multithreadexample;

public class ThreadClassExample extends Thread {
    public void run() {
        System.out.println("Thread class thread is running...");
    }

    public static void main(String args[]) {
        ThreadClassExample thread = new ThreadClassExample();
        thread.start();

        RunnableExample runnableThread =new RunnableExample();
        Thread thread1 =new Thread(runnableThread);
        thread1.start();
    }
}

