/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.turkey;

/**
 *
 * @author Armando
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");

    }

}
