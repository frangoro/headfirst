package org.frangoro.headfirst.template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steep the teap");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon");
    }
}
