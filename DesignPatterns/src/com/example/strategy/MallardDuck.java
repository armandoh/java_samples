/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy;

import com.example.strategy.implementations.FlyWithWings;
import com.example.strategy.implementations.Quack;

/**
 *
 * @author Armando
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    
    public void display(){
        System.out.println("I'm a real Mallard duck!");
    }
}
