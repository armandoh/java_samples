/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.factory;

/**
 *
 * @author Armando
 */
public class DecoyDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

    @Override
    public String toString() {
        return "Decoy Duck";
    }

}
