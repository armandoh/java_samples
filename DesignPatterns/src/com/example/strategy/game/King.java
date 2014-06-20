/*
 * Using examples from Head First - Design Patterns
 */

package com.example.strategy.game;

import com.example.strategy.game.impl.Character;
import com.example.strategy.game.impl.SwordBehavior;

/**
 *
 * @author Armando
 */
public class King extends Character{

    
    
    public King(){
        setWeapon(new SwordBehavior());
    }
    
    @Override
    public void fight() {
        System.out.println("I'm the King fighting for my kingdom!");                
        weapon.useWeapon();
    }



}
