package es.frangoro.headfirst.simuduck.client;

import es.frangoro.headfirst.simuduck.strategy.FlyNoWay;
import es.frangoro.headfirst.simuduck.strategy.Squeak;

public class SimUDuck {
	
	public static void main (String[] args) {
		
		Duck duck = new MallardDuck();
		
		duck.display();
		duck.swim();
		
		duck.performFly();
		duck.performQuack();
		
		// Interchange algorithms at run time (strategy)
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new Squeak());
		
		duck.performFly();
		duck.performQuack();
	}

}
