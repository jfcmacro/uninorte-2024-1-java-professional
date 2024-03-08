package com.epam.rd.uninorte;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public LimitBufferImpl extends LimitBuffer {

    private Lock lock;
    private Condition full;
    private Condition empty;
    private int[] buffer;
    private int counter;
    private int iPut;
    private int iGet;

    public LimitBufferImpl(int size) {
        lock = new ReentrantLock();
        buffer = new int[size];
        counter = 0;
        iPut = 0;
        iGet = 0;
        full = lock.newCondition();
        empty = lock.newCondition();
    }

    public void put(int value) {

            lock.lock();
            try {
                while (counter == buffer.length)  { // Buffer is full
                    full.await();
                }

                buffer[iPut] = value;
                iPut = (iPut + 1) % buffer.length;
                counter++;

                empty.signal();
            } finally {
                lock.unlock();
            }
        }

    public int get() {
            lock.lock();
            try {
                while (counter == 0) { //
                   empty.await();
                }

                int ret = 0;
                ret = buffer[iGet];
                iGet = (iGet + 1) % buffer.length;
                counter--;

                full.signal();
            } finally {
                lock.unlock();
            }
        }
}
