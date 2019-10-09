package org.frangoro.headfirst.compound;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
