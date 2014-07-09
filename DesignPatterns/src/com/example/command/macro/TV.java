/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;


/**
 *
 * @author Armando
 */
public class TV {

    String location = "";
    byte channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is On!");
    }

    public void off() {
        System.out.println(location + " TV is Off!");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }

}
