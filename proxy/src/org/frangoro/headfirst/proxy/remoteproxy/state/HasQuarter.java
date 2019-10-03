package org.frangoro.headfirst.proxy.remoteproxy.state;

import org.frangoro.headfirst.proxy.remoteproxy.GumballMachine;

import java.util.Random;

public class HasQuarter implements State {

    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;
    transient Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("Gumball ready!");
        if (randomWinner.nextInt(10) == 0 && gumballMachine.getCount() > 1)
            gumballMachine.setCurrentState(gumballMachine.getWinner());
        else
            gumballMachine.setCurrentState(gumballMachine.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball ready to be dispensed");

    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}
