/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton;

/**
 *
 * @author Armando
 */
public class SingletonSynchronizedVolatile {

    private static volatile SingletonSynchronizedVolatile uniqueInsance;

    public SingletonSynchronizedVolatile() {

    }

    public static SingletonSynchronizedVolatile getInstance() {
        if (uniqueInsance == null) {
            synchronized (SingletonSynchronizedVolatile.class) {
                if (uniqueInsance == null) {
                    uniqueInsance = new SingletonSynchronizedVolatile();
                }
            }
        }
        return uniqueInsance;
    }

}
