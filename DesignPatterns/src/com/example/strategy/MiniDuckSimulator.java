/*
 * Using examples from Head First - Design Patterns
 */
package com.example.strategy;

import com.example.strategy.implementations.FlyRocketPowered;

/**
 *
 * @author Armando
 */
public class MiniDuckSimulator {

    public static void main(String... args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
}
