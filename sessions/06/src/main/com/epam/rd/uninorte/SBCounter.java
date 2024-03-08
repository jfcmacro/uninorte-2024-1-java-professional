package com.epam.rd.uninorte;

public class SBCounter implements Counter {

    private int counter;

    public SBCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void incr() {
        synchronized(this) {
            counter++;
        }
    }

    @Override
    public int getCounter() {
        int ret = 0;
        synchronized(this) {
            ret = counter;
        }
        return ret;
    }
}
