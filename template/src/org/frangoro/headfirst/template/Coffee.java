package org.frangoro.headfirst.template;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brew coffee grinds");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
