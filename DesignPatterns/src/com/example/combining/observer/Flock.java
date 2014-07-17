/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando
 */
public class Flock implements Quackable {

    List<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock of Quackers";
    }

}
