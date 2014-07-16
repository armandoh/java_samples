/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumball;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Armando
 */
public interface GumballMachineRemote extends Remote, Serializable {

    static final long serialVersionUID = 16L;

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;

}
