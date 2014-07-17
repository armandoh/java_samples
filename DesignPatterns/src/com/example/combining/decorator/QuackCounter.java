/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.decorator;

/**
 *
 * @author Armando
 */
public class QuackCounter implements Quackable {

    private Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public String toString() {
        return duck.toString();
    }

}
