/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.method;


/**
 *
 * @author Armando
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

}
