/*
 * Using examples from Head First - Design Patterns
 */
package com.example.proxy.gumball;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Armando
 */
public class GumballMonitorTest {

    public static void main(String[] args) {
        String[] location = {GumballRMIConstants.HOST};
        /*
         String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
         "rmi://boulder.mightygumball.com/gumballmachine",
         "rmi://seattle.mightygumball.com/gumballmachine"};
         */
        if (args.length <= 0) {
            location = new String[1];
            location[0] = "rmi://localhost/gumballmachine";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                //GumballMachineRemote machine= (GumballMachineRemote) Naming.lookup(location[i]);
                Registry registry = LocateRegistry.getRegistry(GumballRMIConstants.HOST, GumballRMIConstants.PORT);
                GumballMachineRemote machine = (GumballMachineRemote) registry.lookup(GumballRMIConstants.NAME);

                monitor[i] = new GumballMonitor(machine);
                System.out.println("got one: " + monitor[i]);
            } catch (NotBoundException | RemoteException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
