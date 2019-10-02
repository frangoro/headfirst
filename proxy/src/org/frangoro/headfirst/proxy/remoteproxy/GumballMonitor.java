package org.frangoro.headfirst.proxy.remoteproxy;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current Inventory: " + gumballMachine.getCount());
        System.out.println("Current State: " + gumballMachine.getCurrentState());
    }
}
