package com.epam.rd.uninorte;

public class SMCounter implements Counter {

    private int counter;

    public SMCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public synchronized void incr() {
        counter++; // mov counter, stack  t1 t2
                   // incrStack
                   // mov stack, counter
    }

    @Override
    public synchronized int getCounter() {
        return counter;
    }
}
