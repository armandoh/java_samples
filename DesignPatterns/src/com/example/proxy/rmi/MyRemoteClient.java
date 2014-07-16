/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Armando
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go(args);
    }

    public void go(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {

            Registry registry = LocateRegistry.getRegistry(MyConstants.HOST, MyConstants.PORT);

            MyRemote service = (MyRemote) registry.lookup(MyConstants.NAME);

            String s = service.sayHello();

            System.out.println(s);

        } catch (NotBoundException | RemoteException ex) {
            ex.printStackTrace();
        }

    }
}
