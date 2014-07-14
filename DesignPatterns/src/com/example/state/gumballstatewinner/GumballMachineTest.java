/*
 * Using examples from Head First - Design Patterns
 */
package com.example.state.gumballstatewinner;

/**
 *
 * @author Armando
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine
                = new GumballMachine(10);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        /*
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
                */
    }
}
