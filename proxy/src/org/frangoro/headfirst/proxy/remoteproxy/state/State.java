package org.frangoro.headfirst.proxy.remoteproxy.state;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void refill();
}
