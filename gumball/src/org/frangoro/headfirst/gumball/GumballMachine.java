package org.frangoro.headfirst.gumball;

import org.frangoro.headfirst.gumball.state.*;

public class GumballMachine {

    State soldOut = new SoldOut(this);
    State noQuarter = new HasNoQuarter(this);
    State hasQuarter = new HasQuarter(this);
    State sold = new Sold(this);
    State winner = new Winner(this);

    State currentState = soldOut;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        // If inventory isn't zero then state is waiting a quarter,
        // otherwise state stays SOLD_OUT
        if (count > 0)
            currentState = noQuarter;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void refill (int count) {
        this.count += count;
        System.out.println("Refilled: " + count);
        currentState.refill();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        String s = "Mighty Gumball, Inc.\n Inventory: " + count +"\n State: " + currentState;
        return s;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getSold() {
        return sold;
    }

    public State getWinner() {
        return winner;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count --;
        }
    }
}
