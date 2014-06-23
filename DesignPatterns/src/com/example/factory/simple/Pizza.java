/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.simple;

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
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
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
