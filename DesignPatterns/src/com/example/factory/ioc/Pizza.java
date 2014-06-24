/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.ioc;

import com.example.factory.ioc.ingredients.Dough;
import com.example.factory.ioc.ingredients.Veggies;
import com.example.factory.ioc.ingredients.Cheese;
import com.example.factory.ioc.ingredients.Clams;
import com.example.factory.ioc.ingredients.Sauce;
import com.example.factory.ioc.ingredients.Pepperoni;

/**
 *
 * @author Armando
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 munites at 350 ");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        display.append(cheese).append("\n");
        display.append(pepperoni).append("\n");
        display.append(veggies).append("\n");
        display.append(clam).append("\n");

        return display.toString();
    }

}
