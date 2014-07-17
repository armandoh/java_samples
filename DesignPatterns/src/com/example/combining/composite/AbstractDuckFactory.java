/*
 * Using examples from Head First - Design Patterns
 */
package com.example.combining.composite;

/**
 *
 * @author Armando
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
