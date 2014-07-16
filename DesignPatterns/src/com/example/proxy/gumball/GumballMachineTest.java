/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumball;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Armando
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            GumballMachineRemote gumballMachine = new GumballMachine(args[0], count);
            //Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);

            GumballMachineRemote stub = (GumballMachineRemote) UnicastRemoteObject.exportObject(gumballMachine, 0);
            Registry registry = LocateRegistry.createRegistry(GumballRMIConstants.PORT);
            registry.bind(GumballRMIConstants.NAME, stub);

            System.out.println("GumballMachineTest bound");

        } catch (NumberFormatException | RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
