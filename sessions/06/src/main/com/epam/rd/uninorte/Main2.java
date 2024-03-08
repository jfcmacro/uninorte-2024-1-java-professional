package com.epam.rd.uninorte;

public class Main2 {

    public static void main(String...args) {
        Counter counter = new LockCounter(0);

        Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.incr();
                }
        });
        Thread t2 = new Thread(() -> {
                for (int i = 0; i < 2000; i++) {
                    counter.incr();
                }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException ie) {
        }

        System.out.println("Counter: " + counter.getCounter());
    }
}
