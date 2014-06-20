/*
 * Using examples from Head First - Design Patterns
 *
 */
package com.example.strategy.game;

import com.example.strategy.game.impl.AxeBehavior;
import com.example.strategy.game.impl.BowAndArrowBehavior;
import com.example.strategy.game.impl.Character;
import com.example.strategy.game.impl.SwordBehavior;

/**
 *
 * @author Armando
 */
public class CharacterSimulator {

    public static void main(String... args) {

        Character king = new King();
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        Character troll = new Troll();
        troll.fight();

        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();

        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new AxeBehavior());
        knight.fight();
    }
}
