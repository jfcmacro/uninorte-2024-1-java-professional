package org.jfcmc.threads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class MyThreadFactory implements ThreadFactory {

    private int nActive = 0;
    private int nTotal = 0;
    private Lock lock;
    private Condition allEnded;

    public MyThreadFactory() {
        lock = new ReentrantLock();
        allEnded = lock.newCondition();
    }

    public Thread newThread(Runnable runnable) {
        Thread ret = new Thread(() ->  {
                lock.lock();
                try {
                    nActive++;
                    nTotal++;
                    Thread.currentThread().setName("[Thread: " + nTotal + "]");
                } finally {
                    lock.unlock();
                }
                Throwable thro = null;
                try {
                    runnable.run();
                } catch(Throwable throwable) {
                    // El hilo se porto mal
                    thro = throwable;
                }
                // new FinishedThreadResult(Thread.currentThread.getName(), ..., thro)
                lock.lock();
                try {
                    // result.add();
                    nActive--;
                    if (nActive == 0) {
                        allEnded.signal();
                    }
                } finally {
                    lock.unlock();
                }

        });
        return ret;
    }

    public int numberActiveThreads() {
        int ret;
        lock.lock();
        try {
            ret = nActive;
        } finally {
            lock.unlock();
        }
        return ret;
    }

    public int total() {
        int ret;
        lock.lock();
        try {
            ret = nTotal;
        } finally {
            lock.unlock();
        }
        return ret;
    }

    public void awaiting() {
        lock.lock();
        try {
            allEnded.await();
        } catch (InterruptedException ie) {
        } finally {
            lock.unlock();
        }
    }
}
