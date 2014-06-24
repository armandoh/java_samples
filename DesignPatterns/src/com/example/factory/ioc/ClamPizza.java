/*
 * Using examples from Head First - Design Patterns
 */

package com.example.factory.ioc;

/**
 *
 * @author Armando
 */
public class ClamPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

}
