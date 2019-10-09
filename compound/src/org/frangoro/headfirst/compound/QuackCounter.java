package org.frangoro.headfirst.compound;

public class QuackCounter implements Quackable {

    Quackable duck;
    static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        count ++;
        duck.quack();
    }

    public static int getQuacks() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

    }

}
