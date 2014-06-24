/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.ioc;

import com.example.factory.ioc.ingredients.Veggies;
import com.example.factory.ioc.ingredients.MozzarellaCheese;
import com.example.factory.ioc.ingredients.Cheese;
import com.example.factory.ioc.ingredients.BlackOlives;
import com.example.factory.ioc.ingredients.ThickCrustDough;
import com.example.factory.ioc.ingredients.Pepperoni;
import com.example.factory.ioc.ingredients.FrozenClam;
import com.example.factory.ioc.ingredients.EggPlant;
import com.example.factory.ioc.ingredients.SlicedPepperoni;
import com.example.factory.ioc.ingredients.Dough;
import com.example.factory.ioc.ingredients.Clams;
import com.example.factory.ioc.ingredients.Sauce;
import com.example.factory.ioc.ingredients.Spinach;
import com.example.factory.ioc.ingredients.PlumTomatoSauce;

/**
 *
 * @author Armando
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVegies() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }

}
