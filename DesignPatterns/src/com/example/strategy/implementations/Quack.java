/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.implementations;

import com.example.strategy.interfaces.QuackBehavior;

/**
 *
 * @author Armando
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
       System.out.println("Quack! Quack! quack! ");
    }

}
