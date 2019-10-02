package org.frangoro.headfirst.gumball.state;

import org.frangoro.headfirst.gumball.GumballMachine;

public class SoldOut implements State {

    GumballMachine gumballMachine;

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
    public String toString() {
        return "SoldOut";
    }
}
