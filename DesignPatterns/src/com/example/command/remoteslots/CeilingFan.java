/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;

/**
 *
 * @author Armando
 */
public class CeilingFan {

    String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " ceilingFan is On!");
    }

    public void off() {
        System.out.println(location + " ceilingFan is Off!");
    }
}
