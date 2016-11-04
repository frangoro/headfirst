package es.frangoro.headfirst.pizzastore.factory;

import es.frangoro.headfirst.pizzastore.product.CheesePizza;
import es.frangoro.headfirst.pizzastore.product.ClamPizza;
import es.frangoro.headfirst.pizzastore.product.PepperoniPizza;
import es.frangoro.headfirst.pizzastore.product.Pizza;
import es.frangoro.headfirst.pizzastore.product.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {

		if (type.equals("cheese")) {
			return new CheesePizza();
		} else if (type.equals("veggie")) {
			return new VeggiePizza();
		} else if (type.equals("clam")) {
			return new ClamPizza();
		} else if (type.equals("pepperoni")) {
			return new PepperoniPizza();
		} else
			return null;
	}
}
