/*
 * Using examples from Head First - Design Patterns
 */
package com.example.template_method.beverage;

/**
 *
 * @author Armando
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
