/*
 * Using examples from Head First - Design Patterns
 */
package com.example.template_method.beverage;

/**
 *
 * @author Armando
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
