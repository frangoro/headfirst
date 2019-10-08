package org.frangoro.headfirst.compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add (Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> it = quackers.iterator();
        Quackable duck;
        while(it.hasNext()) {
            duck = it.next();
            duck.quack();
        }
    }
}
