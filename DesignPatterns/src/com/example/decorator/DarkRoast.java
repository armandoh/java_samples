/*
 * Using examples from Head First - Design Patterns
 */
package com.example.decorator;

/**
 *
 * @author Armando
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
