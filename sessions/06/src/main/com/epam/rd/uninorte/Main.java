package com.epam.rd.uninorte;

public class Main {

    // Hilo Principal (Main)
    public static void main(String...args) {
        int iLocal = 1;
        System.out.println("Hello, World!");
        MyThread myThread = new MyThread();
        myThread.start();
        // Runnable thread3 = new Runnable() {

        //         @Override
        //         public void run() {
        //             iLocalThread3++;
        //             System.out.println("Hello, from Runnable");
        //         }
        //     };
        // Runnable thread3 = () -> {
        //     System.out.println("Hello, from Lambda Runnable");
        // };
        // Thread myThread3 = new Thread(thread3);
        Thread myThread3 = new Thread(() -> {
                                          Thread t = Thread.currentThread();
                                          System.out.println("Hello, from Lambda Runnable: " + t.getName());
        },
            "HiloLambda");
        myThread3.start();
        // System.exit(0);
    }
}
