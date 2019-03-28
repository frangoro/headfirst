package com.frangoro.factorypattern.pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = this.getClass().getSimpleName();
        dough = "NY cheese dough";
        sauce = "NY cheese sauce";
        toppings.add("Tomato");
        toppings.add("Onions");
    }

    @Override
    public void cut() {
        System.out.println("NY Style cut");
    }
}
