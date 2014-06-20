/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.game.impl;

import com.example.strategy.game.interfaces.WeaponBehavior;

/**
 *
 * @author Armando
 */
public abstract class Character {
    
    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    
    public abstract void fight();

    
}
