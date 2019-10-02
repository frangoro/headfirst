package org.frangoro.headfirst.gumball.state;

import org.frangoro.headfirst.gumball.GumballMachine;

public class HasQuarter implements State {

    GumballMachine gumballMachine;

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
        gumballMachine.setCurrentState(gumballMachine.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball ready to be dispensed");

    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}
