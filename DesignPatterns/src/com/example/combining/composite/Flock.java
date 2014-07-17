/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando
 */
public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public String toString() {
        return "Flock of Quackers";
    }

}
