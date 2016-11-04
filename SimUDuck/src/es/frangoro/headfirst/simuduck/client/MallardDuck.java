package es.frangoro.headfirst.simuduck.client;

import es.frangoro.headfirst.simuduck.strategy.FlyWithWings;
import es.frangoro.headfirst.simuduck.strategy.Quack;

public class MallardDuck extends Duck {

	MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Mallard duck.");
	}
}
