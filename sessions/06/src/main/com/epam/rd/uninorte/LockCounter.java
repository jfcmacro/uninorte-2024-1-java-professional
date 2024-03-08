package com.epam.rd.uninorte;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter implements Counter {

    private int counter;
    private Lock lock;

    public LockCounter(int counter) {
        this.lock = new ReentrantLock();
        this.counter = counter;
    }

    @Override
    public void incr() {
        while (!lock.tryLock()); // active wait
        
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int getCounter() {
        int ret = 0;
        lock.lock();
        try {
            ret = counter;
        } finally {
            lock.unlock();
        }
        return ret;
    }
}
