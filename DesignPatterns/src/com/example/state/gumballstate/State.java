/*
 * Using examples from Head First - Design Patterns
 */
package com.example.state.gumballstate;

/**
 *
 * @author Armando
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
