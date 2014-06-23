/*
 * Using examples from Head First - Design Patterns
 */

package com.example.decorator;

/**
 *
 * @author Armando
 */
public abstract class Beverage {

    String description= "Unkown Beverage";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
