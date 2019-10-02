package org.frangoro.headfirst.proxy.remoteproxy;

import javax.swing.plaf.IconUIResource;

public class GumballMachineTestDrive {

    public static void main (String[] args) {
        int count = 0;
        String location;

        if (args.length < 2) {
            System.out.println("GumballMachine <inventory> <location>");
            System.exit(1);
        }

        count = Integer.parseInt(args[0]);
        location = args[1];

        GumballMachine gumballMachine = new GumballMachine(count, location);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}
