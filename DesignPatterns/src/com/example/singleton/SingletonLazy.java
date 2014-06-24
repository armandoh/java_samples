/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton;

/**
 *
 * @author Armando
 */
public class SingletonLazy {

    private static SingletonLazy uniqueInsance = new SingletonLazy();

    public SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        return uniqueInsance;
    }

}
