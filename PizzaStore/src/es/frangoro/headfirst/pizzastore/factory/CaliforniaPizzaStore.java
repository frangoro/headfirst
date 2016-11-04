package es.frangoro.headfirst.pizzastore.factory;

import es.frangoro.headfirst.pizzastore.product.NYStyleCheesePizza;
import es.frangoro.headfirst.pizzastore.product.NYStyleClamPizza;
import es.frangoro.headfirst.pizzastore.product.NYStylePepperoniPizza;
import es.frangoro.headfirst.pizzastore.product.NYStyleVeggiePizza;
import es.frangoro.headfirst.pizzastore.product.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza (String type) {
		
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
