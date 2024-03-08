package com.epam.rd.uninorte;

public class Singleton {
    private Singleton() { }
    private static Singleton instance = null;
    public static Singleton newInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
