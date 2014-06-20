/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.game.impl;

import com.example.strategy.game.interfaces.WeaponBehavior;

/**
 *
 * @author Armando
 */
public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Swinging a legendary sword! ");
    }

}
