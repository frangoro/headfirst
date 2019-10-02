package org.frangoro.headfirst.proxy.remoteproxy.state;


import org.frangoro.headfirst.proxy.remoteproxy.GumballMachine;

public class Sold implements State {

    GumballMachine gumballMachine;

    public Sold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("It is not able to eject quarter because crank was turned");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank already turned");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOut());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "Sold";
    }
}
