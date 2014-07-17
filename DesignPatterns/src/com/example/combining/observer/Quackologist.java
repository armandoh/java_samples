/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.observer;

/**
 *
 * @author Armando
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    @Override
    public String toString() {
        return "Quackologist";
    }

}
