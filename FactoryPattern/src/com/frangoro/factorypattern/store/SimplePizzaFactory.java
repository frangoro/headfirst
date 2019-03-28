package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.CheesePizza;
import com.frangoro.factorypattern.pizza.PepperoniPizza;
import com.frangoro.factorypattern.pizza.Pizza;

public class SimplePizzaFactory {

    public /*static*/ Pizza createPizza(String type) {

        switch (type) {
            case "CHEESE":
                return new CheesePizza();
            case "PEPPERONI":
                return new PepperoniPizza();
            case "CLAM":
                return new PepperoniPizza();
            case "VEGGIE":
                return new PepperoniPizza();
            default:
                return new CheesePizza();
        }
    }
}
