package com.epam.rd.uninorte;

public class BadCounter implements Counter {

    private int counter;

    public BadCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void incr() {
        counter++; // mov counter, stack  t1 t2
                   // incrStack
                   // mov stack, counter
    }

    @Override
    public int getCounter() {
        return counter;
    }
}
