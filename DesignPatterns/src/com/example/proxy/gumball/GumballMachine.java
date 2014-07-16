/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumball;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Armando
 */
public class GumballMachine implements Serializable, GumballMachineRemote {

    private static final long serialVersionUID = 17L;
    
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;
    private String location;

    /*
    public GumballMachine() throws RemoteException {
        super();
    }*/
    
    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            this.state = noQuarterState;
            System.out.println("Seeting No Quarter state ");
        }
        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n\n------------------------------------------------ ");
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2014");
        result.append("\nInventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is ").append(state).append("\n");
        result.append("------------------------------------------------ ").append("\n");
        return result.toString();
    }
}
