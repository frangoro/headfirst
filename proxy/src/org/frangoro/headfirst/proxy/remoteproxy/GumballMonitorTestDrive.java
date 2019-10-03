package org.frangoro.headfirst.proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main (String args[]) {

        GumballMachineRemote gumballMahcine;
        GumballMonitor gumballMonitor;

        {
            try {
                gumballMahcine = (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballmachine");
                gumballMonitor = new GumballMonitor(gumballMahcine);
                gumballMonitor.report();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
