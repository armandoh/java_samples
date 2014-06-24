/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.ioc;

import com.example.factory.ioc.ingredients.Garlic;
import com.example.factory.ioc.ingredients.Veggies;
import com.example.factory.ioc.ingredients.ReggianoCheese;
import com.example.factory.ioc.ingredients.Cheese;
import com.example.factory.ioc.ingredients.Pepperoni;
import com.example.factory.ioc.ingredients.Onion;
import com.example.factory.ioc.ingredients.ThinCrustDough;
import com.example.factory.ioc.ingredients.RedPepper;
import com.example.factory.ioc.ingredients.Mushroom;
import com.example.factory.ioc.ingredients.SlicedPepperoni;
import com.example.factory.ioc.ingredients.Dough;
import com.example.factory.ioc.ingredients.Clams;
import com.example.factory.ioc.ingredients.Sauce;
import com.example.factory.ioc.ingredients.FreshClams;
import com.example.factory.ioc.ingredients.MarinaraSauce;

/**
 *
 * @author Armando
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVegies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
