/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.game;

import com.example.strategy.game.impl.KnifeBehavior;

/**
 *
 * @author Armando
 */
public class Queen extends com.example.strategy.game.impl.Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the Queen helping the King to save the kingdom!");
        weapon.useWeapon();
    }

}
