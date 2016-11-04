package es.frangoro.headfirst.starbuzz.decorator;

import es.frangoro.headfirst.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();
}
