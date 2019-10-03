package org.frangoro.headfirst.proxy.remoteproxy;

import org.frangoro.headfirst.proxy.remoteproxy.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    public String getLocation() throws RemoteException;
    public int getCount() throws RemoteException;
    public State getCurrentState()  throws RemoteException;
}
