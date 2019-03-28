package com.frangoro.factorypattern.pizza;

import com.frangoro.factorypattern.pizza.Pizza;

public class BeaconPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("com.frangoro.factorypattern.pizza.Pizza with Beacon");
    }
}
