/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;


/**
 *
 * @author Armando
 */
public class GarageDoor {
    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }
    
    public void up() {
        System.out.println("Garage door is up!");
    }

    public void down() {
        System.out.println("Garage door is down!");
    }

    public void stop() {
        System.out.println("Stop garage door!");
    }

    public void lightOn() {
        System.out.println("Light is On!");
    }

    public void lightOff() {
        System.out.println("Light is Off!");
    }
}
