/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.implementations;

import com.example.strategy.interfaces.QuackBehavior;

/**
 *
 * @author Armando
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak! Squeak! squeak! ");
    }

}
