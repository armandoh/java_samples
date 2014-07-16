/*
 * Using examples from Head First - Design Patterns
 */

package com.example.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Armando
 */
public interface MyRemote extends Remote{

    public String sayHello() throws RemoteException;
    
}
