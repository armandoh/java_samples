/*
 * Using examples from Head First - Design Patterns
 */
package com.example.facade.hometheater;

/**
 *
 * @author Armando
 */
public class PopcornPopper {

    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    @Override
    public String toString() {
        return description;
    }
}
