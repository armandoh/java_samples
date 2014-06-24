/*
 * Using examples from Head First - Design Patterns
 */
package com.example.singleton.chocolate;

/**
 *
 * @author Armando
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {

        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
