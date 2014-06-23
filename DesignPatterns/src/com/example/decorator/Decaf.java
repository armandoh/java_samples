/*
 * Using examples from Head First - Design Patterns
 */
package com.example.decorator;

/**
 *
 * @author Armando
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
