package es.frangoro.headfirst.starbuzz.decorator;

import es.frangoro.headfirst.starbuzz.component.Beverage;

public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
