package org.frangoro.headfirst.gumball;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0)
            state = NO_QUARTER;
    }

    public void insertQuarter() {
        if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == HAS_QUARTER) {
            System.out.println("You already have inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("There are no gumballs");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball!");
        }
    }

    public void ejectQuarter() {
        if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returned");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot eject, you have not inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank!");
        }
    }

    public void turnCrank() {
        if (state == NO_QUARTER) {
            System.out.println("You have not inserted a quarter");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            System.out.println("Gumball on the way!");
            dispense();
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot turn crank, you have not inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball!");
        }
    }

    public void dispense() {
        if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == HAS_QUARTER) {
            System.out.println("You need to turn crank first");
        } else if (state == SOLD_OUT) {
            System.out.println("There are no gumballs");
        } else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                System.out.println("Enjoy your gumball :)");
                state = NO_QUARTER;
            }
        }
    }

    public String toString() {
        String s = "Mighty Gumball, Inc.\n Inventory: " + count +"\nState: " + state;
        return s;
    }
}
