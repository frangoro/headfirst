package org.frangoro.headfirst.gumball;

public class GumballMachineTestDrive {
    public static void main (String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
