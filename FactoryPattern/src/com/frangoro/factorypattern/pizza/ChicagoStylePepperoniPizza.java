package com.frangoro.factorypattern.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = this.getClass().getSimpleName();
        dough = "Chicago cheese dough";
        sauce = "Chicago cheese sauce";
        toppings.add("Cheese Parmesano");
        toppings.add("Cheese Payoyo");
    }

}
