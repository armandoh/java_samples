/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.undo;


/**
 *
 * @author Armando
 */
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is On!");
    }

    public void off() {
        System.out.println(location + " light is Off!");
    }
}
