package org.frangoro.headfirst.proxy.remoteproxy.state;

import org.frangoro.headfirst.proxy.remoteproxy.GumballMachine;

public class SoldOut implements State {

    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;

    public SoldOut(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There are no gumballs");

    }

    @Override
    public void turnCrank() {
        System.out.println("There are no gumballs");

    }

    @Override
    public void dispense() {
        System.out.println("There are no gumballs");

    }

    @Override
    public void refill() {
        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
    }

    @Override
    public String toString() {
        return "SoldOut";
    }
}
