/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton;

/**
 *
 * @author Armando
 */
public class SingletonByJvm {

    private static final SingletonByJvm uniqueInsance = new SingletonByJvm();

    public SingletonByJvm() {

    }

    public static SingletonByJvm getInstance() {
        return uniqueInsance;
    }

}
