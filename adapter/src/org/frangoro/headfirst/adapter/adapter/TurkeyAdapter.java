package org.frangoro.headfirst.adapter.adapter;

import org.frangoro.headfirst.adapter.bean.Duck;
import org.frangoro.headfirst.adapter.bean.Turkey;

/**
 * This class adapt turkeys to ducks in order to use
 * a turkey like a duck.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i<5; i++) {
            turkey.fly();
        }
    }
}
