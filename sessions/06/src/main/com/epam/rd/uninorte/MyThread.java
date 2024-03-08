package com.epam.rd.uninorte;

public class MyThread extends Thread {
    public MyThread() {
        super("MyThread");
    }
    public void run() {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie) { }

        System.out.println("Hello from MyThread: " +
                           Thread.currentThread().getName());
    }
}
