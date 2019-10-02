package org.frangoro.headfirst.gumball.state;

import org.frangoro.headfirst.gumball.GumballMachine;

/*
10 out of 100 get a free gumball
 */
public class Winner implements State {

    GumballMachine gumballMachine;

    public Winner(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Gumball was already sold");

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
            gumballMachine.releaseBall();
            System.out.println("You are the winner and you get two gumballs");
            if (gumballMachine.getCount() == 0) {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setCurrentState(gumballMachine.getSoldOut());
            } else {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
            }
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "SoldOut";
    }
}
