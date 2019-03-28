package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.*;

public class NYStylePizzaStoreV3 extends  PizzaStoreV3 {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "CHEESE":
                return new NYStyleCheesePizza();
            case "PEPPERONI":
                return new NYStylePepperoniPizza();
            case "CLAM":
                return new NYStyleClamPizza();
            case "VEGGIE":
                return new NYStyleVeggieiPizza();
            default:
                return new NYStyleCheesePizza();
        }
    }
}
