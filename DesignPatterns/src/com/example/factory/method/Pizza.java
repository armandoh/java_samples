/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.method;

import java.util.ArrayList;

/**
 *
 * @author Armando
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        
        for(String topping: toppings){
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 munites at 350 " );
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices" );
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append((String) topping).append("\n");
        }
        
        /*
        toppings.stream().forEach((topping) -> {
            display.append((String) topping).append("\n");
        });        
        */
        return display.toString();
    }

}
