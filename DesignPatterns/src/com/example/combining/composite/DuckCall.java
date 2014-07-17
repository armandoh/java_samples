/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.composite;

/**
 *
 * @author Armando
 */
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
