/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.simple;

/**
 *
 * @author Armando
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

}
