package org.frangoro.headfirst.proxy.remoteproxy;

import javax.swing.plaf.IconUIResource;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

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

        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(count, location);
            Naming.rebind("//" + location + "/gumballmachine", gumballMachine);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}
