/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumballmonitor;

/**
 *
 * @author Armando
 */
public class GumballMonitor {

    private GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("*******************************************************");
        System.out.println("-----------------  R E P O R T  -----------------------");
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
