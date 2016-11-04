package es.frangoro.headfirst.simuduck.client;

import es.frangoro.headfirst.simuduck.strategy.FlyBehavior;
import es.frangoro.headfirst.simuduck.strategy.QuackBehavior;

public abstract class Duck {
	
	// Instance variables (composition)
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	// Common behavior
	
	public void swim() {
		System.out.println("All ducks can swim.");
	}
	
	public abstract void display();
	
	// Dynamically behavior interchange
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
	
	// Delegate methods
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
}
