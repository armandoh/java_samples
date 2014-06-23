/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.simple;

/**
 *
 * @author Armando
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }

}
