/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.undo;

/**
 *
 * @author Armando
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    String location = "";
    byte speed;
    
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
    
    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }
    
    public void low(){
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }
    /*
    public void on() {
        System.out.println(location + " ceilingFan is On!");
    }
    */
    
    public void off() {
        speed = OFF;
        System.out.println(location + " ceilingFan is Off!");
    }
    
    public byte getSpeed(){
        return speed;
    }
    
}
