/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumball;

import java.io.Serializable;

/**
 *
 * @author Armando
 */
public interface State extends Serializable {

    public static final long serialVersionUID = -6849794470754667710L;
    
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
    
}
