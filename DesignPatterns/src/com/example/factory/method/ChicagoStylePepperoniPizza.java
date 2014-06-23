/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.method;



/**
 *
 * @author Armando
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "Spicy sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }

}
