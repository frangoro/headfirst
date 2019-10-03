package org.frangoro.headfirst.proxy.remoteproxy;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current Inventory: " + gumballMachine.getCount());
            //System.out.println("Current State: " + gumballMachine.getCurrentState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
