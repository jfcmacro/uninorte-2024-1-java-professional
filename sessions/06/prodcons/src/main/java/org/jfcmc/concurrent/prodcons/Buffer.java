package org.jfcmc.concurrent.prodcons;

/**
 * Buffer
 *
 * author: Juan Francisco Cardona McCormick
 * date: 01/03/2024
 *
 */
public interface Buffer<T> {
    void put(T t);
    T get();
}
