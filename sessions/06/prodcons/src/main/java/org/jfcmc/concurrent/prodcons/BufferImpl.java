package org.jfcmc.concurrent.prodcons;

public class BufferImpl<T> implements Buffer<T> {
    private T[] buffer;
    private int size;
    private int inBuf;
    private int outBuf;
    private int elements;

    private int nextPos(int index) {
        return (index + 1) % size;
    }

    public BufferImpl(int size) {
        this.buffer = new T[size];
        this.size = size;
        this.inBuf = this.outBuf = this.elements = 0;
    }

    public void
}
