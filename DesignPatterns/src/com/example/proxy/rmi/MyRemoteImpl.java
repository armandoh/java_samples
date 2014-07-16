/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Armando
 */
public class MyRemoteImpl implements MyRemote {

    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            MyRemote service = new MyRemoteImpl();
            MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(service, 0);
            //Registry registry = LocateRegistry.getRegistry();            
            //registry.rebind(name, stub);

            Registry registry = LocateRegistry.createRegistry(MyConstants.PORT);
            registry.bind(MyConstants.NAME, stub);

            System.out.println("MyRemoteImpl bound");

        } catch (RemoteException | AlreadyBoundException ex) {
            System.err.println("MyRemoteImpl exception:");
            ex.printStackTrace();
        }

    }
}
