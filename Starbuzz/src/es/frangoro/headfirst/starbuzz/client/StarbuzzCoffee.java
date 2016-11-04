package es.frangoro.headfirst.starbuzz.client;

import es.frangoro.headfirst.starbuzz.component.Beverage;
import es.frangoro.headfirst.starbuzz.component.DarkRoast;
import es.frangoro.headfirst.starbuzz.component.Espresso;
import es.frangoro.headfirst.starbuzz.decorator.Mocha;

public class StarbuzzCoffee {

	public static void main (String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "$" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage.cost());
	}
}
