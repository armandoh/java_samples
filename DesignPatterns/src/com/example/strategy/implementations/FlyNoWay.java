/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.implementations;

import com.example.strategy.interfaces.FlyBehavior;

/**
 *
 * @author Armando
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm sorry but I can not fly! =( ");
    }

}
