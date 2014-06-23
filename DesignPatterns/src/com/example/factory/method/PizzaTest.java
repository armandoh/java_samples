/*
 * Using examples from Head First - Design Patterns
 */
package com.example.factory.method;


/**
 *
 * @author Armando
 */
public class PizzaTest {

    public static void main(String[] args) {        
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
