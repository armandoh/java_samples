/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.game;

import com.example.strategy.game.impl.BowAndArrowBehavior;


/**
 *
 * @author Armando
 */
public class Knight extends com.example.strategy.game.impl.Character {

    public Knight() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the best knight fighting on behalf of my King!");
        weapon.useWeapon();
    }

}
