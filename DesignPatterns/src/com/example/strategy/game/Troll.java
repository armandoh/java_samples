/*
 * Using examples from Head First - Design Patterns
 */
package com.example.strategy.game;

import com.example.strategy.game.impl.AxeBehavior;

/**
 *
 * @author Armando
 */ 
public class Troll extends com.example.strategy.game.impl.Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the Troll trying to defeat the army from the kingdom !!!");
        weapon.useWeapon();
    }

}
