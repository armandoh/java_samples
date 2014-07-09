/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.remoteslots;

/**
 *
 * @author Armando
 */
public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on!");
    }

    public void off() {
        System.out.println(location + " stereo is Off!");
    }
}
