/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton;

/**
 *
 * @author Armando
 */
public class SingletonSynchronized {

    private static SingletonSynchronized uniqueInsance;

    public SingletonSynchronized() {

    }

    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInsance == null) {
            uniqueInsance = new SingletonSynchronized();
        }

        return uniqueInsance;
    }

}
