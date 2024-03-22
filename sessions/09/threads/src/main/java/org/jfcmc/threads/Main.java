package org.jfcmc.threads;

import java.util.concurrent.ThreadFactory;

public class Main {

    private static class CountClass {
        private int count;

        CountClass(int count) {
            this.count = count;
        }

        @Override
            public String toString() {
            return "" + count;
        }
    }


    public static void main(String...args) {

        MyThreadFactory tf = new MyThreadFactory();

        for (int i = 0; i < 10; i++) {

            CountClass nc = new CountClass(i);
            Thread t = tf.newThread(() ->
                                    {
                                        System.out.println("Thread: " + nc.toString());
                                        try {
                                            Thread.currentThread().sleep(1000);
                                        } catch (InterruptedException ie) { }

                                        System.out.println("Ending: " + nc.toString());
                                    });
            t.start();

            System.out.printf("Actives: %d Total: %d%n",
                              tf.numberActiveThreads(),
                              tf.total());
        }

        System.out.printf("Actives: %d Total: %d%n",
                          tf.numberActiveThreads(),
                          tf.total());

        tf.awaiting();
        System.out.println("Main ending");
    }
}
