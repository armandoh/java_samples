/*
 * Using examples from Head First - Design Patterns
 */

package com.example.factory.ioc;

/**
 *
 * @author Armando
 */
public class VeggiePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;
    
    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVegies();
    }

}