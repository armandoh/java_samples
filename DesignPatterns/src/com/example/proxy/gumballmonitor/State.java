/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumballmonitor;

import java.io.Serializable;

/**
 *
 * @author Armando
 */
public interface State extends Serializable {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
