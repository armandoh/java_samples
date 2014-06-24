/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton;

/**
 *
 * @author Armando
 */
public class SingletonClassic {

    private static SingletonClassic uniqueInsance;

    public SingletonClassic() {

    }

    public static SingletonClassic getInstance() {
        if (uniqueInsance == null) {
            uniqueInsance = new SingletonClassic();
        }

        return uniqueInsance;
    }

}
