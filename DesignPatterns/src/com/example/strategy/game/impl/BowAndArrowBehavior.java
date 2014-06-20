/*
 * Using examples from Head First - Design Patterns
 *
 */
package com.example.strategy.game.impl;

import com.example.strategy.game.interfaces.WeaponBehavior;

/**
 *
 * @author Armando
 */
public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow! ");
    }

}
