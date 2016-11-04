package es.frangoro.headfirst.pizzastore.client;

import es.frangoro.headfirst.pizzastore.factory.NYPizzaStore;
import es.frangoro.headfirst.pizzastore.factory.PizzaStore;

public class Franchise {

	public static void main(String[] args) {
		
		/*SimplePizzaFactory spf = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(spf);
		pizzaStore.orderPizza("cheese");*/
		
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");

	}

}
