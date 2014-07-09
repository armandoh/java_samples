/*
 * Using examples from Head First - Design Patterns
 */
package com.example.adapter.turkey;

/**
 *
 * @author Armando
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
