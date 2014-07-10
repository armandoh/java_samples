/*
 * Using examples from Head First - Design Patterns
 */
package com.example.template_method.simple_beverage;

/**
 *
 * @author Armando
 */
public class BeverageTest {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

    }
}
