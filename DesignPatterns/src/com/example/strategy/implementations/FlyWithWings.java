/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.implementations;

import com.example.strategy.interfaces.FlyBehavior;

/**
 *
 * @author Armando
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with my own wings! ");
    }


    

}
