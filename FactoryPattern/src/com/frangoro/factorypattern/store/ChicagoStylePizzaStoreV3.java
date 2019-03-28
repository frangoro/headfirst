package com.frangoro.factorypattern.store;

import com.frangoro.factorypattern.pizza.*;

public class ChicagoStylePizzaStoreV3 extends  PizzaStoreV3 {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "CHEESE":
                return new ChicagoStyleCheesePizza();
            case "PEPPERONI":
                return new ChicagoStylePepperoniPizza();
            case "CLAM":
                return new ChicagoStyleClamPizza();
            case "VEGGIE":
                return new ChicagoStyleVeggieiPizza();
            default:
                return new ChicagoStyleCheesePizza();
        }
    }
}
