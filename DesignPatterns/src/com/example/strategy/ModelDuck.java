/*
 * Using examples from Head First - Design Patterns
 */
package com.example.strategy;

import com.example.strategy.implementations.FlyNoWay;
import com.example.strategy.implementations.Quack;

/**
 *
 * @author Armando
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
