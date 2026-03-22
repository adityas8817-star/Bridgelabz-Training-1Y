package com.gla.Abstract;

public class BackgroundJobExecution {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Background job completed!");
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Main thread is running...");
    }
}