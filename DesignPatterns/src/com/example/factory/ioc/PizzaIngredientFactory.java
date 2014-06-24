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
public interface PizzaIngredientFactory {

    public Dough  createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVegies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
