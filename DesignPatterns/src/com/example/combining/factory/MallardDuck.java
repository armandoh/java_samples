/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.factory;

/**
 *
 * @author Armando
 */
public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public String toString() {
        return "Mallard Duck";
    }
}
