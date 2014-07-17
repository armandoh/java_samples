/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.composite;

/**
 *
 * @author Armando
 */
public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
