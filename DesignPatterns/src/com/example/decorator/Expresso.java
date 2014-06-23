/*
 * Using examples from Head First - Design Patterns
 */
package com.example.decorator;

/**
 *
 * @author Armando
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
