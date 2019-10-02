package org.frangoro.headfirst.gumball.state;

import org.frangoro.headfirst.gumball.GumballMachine;

public class HasNoQuarter implements State {

    GumballMachine gumballMachine;

    public HasNoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please, first insert a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball ready to be dispensed");
    }

    @Override
    public String toString() {
        return "HasNoQuarter";
    }

    @Override
    public void refill() {
    }
}
