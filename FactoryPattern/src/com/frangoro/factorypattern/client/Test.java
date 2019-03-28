package com.frangoro.factorypattern.client;

import com.frangoro.factorypattern.ingredient.NYPizzaIngredientFactory;
import com.frangoro.factorypattern.ingredient.PizzaIngredientFactory;
import com.frangoro.factorypattern.store.*;

import java.util.prefs.Preferences;

public class Test {
    public static void main(String[] args) {

        // First approach
        PizzaStoreV1 psv1 = new PizzaStoreV1();
        psv1.orderPizza(PizzaStoreV1.Type.VEGGIE);
        System.out.println("\n\n");

        // Second approach. Use factory method
        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStoreV2 psv2 = new PizzaStoreV2(spf);
        psv2.orderPizza("CHEESE");
        System.out.println("\n\n");

        // Third approach. Isolated factory method in subclasses
        PizzaStoreV3 nyStylePizzaStoreV3 = new NYStylePizzaStoreV3();
        PizzaStoreV3 chicagoStylePizzaStoreV3 = new ChicagoStylePizzaStoreV3();
        nyStylePizzaStoreV3.orderPizza("CHEESE");
        chicagoStylePizzaStoreV3.orderPizza("PEPPERONI");
        System.out.println("\n\n");

        PizzaIngredientFactory pifny = new NYPizzaIngredientFactory();
        PizzaStoreV3 ps = new NYStylePizzaStoreV4();
    }
}
