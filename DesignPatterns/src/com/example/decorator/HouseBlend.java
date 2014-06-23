/*
 * Using examples from Head First - Design Patterns
 */

package com.example.decorator;

/**
 *
 * @author Armando
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }
    
    @Override
    public double cost(){
        return .89;
    }
}
