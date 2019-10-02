package org.frangoro.headfirst.gumball.state;

import org.frangoro.headfirst.gumball.GumballMachine;

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
        System.out.println("Gumball dispensed");
        gumballMachine.setCurrentState(new Sold(gumballMachine));
        int count = gumballMachine.getCount();
        count--;
        gumballMachine.setCount(count);
        if (count == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOut());
        } else {
            System.out.println("Enjoy your gumball :)");
            gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        }
    }

    @Override
    public String toString() {
        return "Sold";
    }
}
