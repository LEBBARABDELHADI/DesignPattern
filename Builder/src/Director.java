
public class Director {

	private PizzaBuilderClass pizzaBuilder;
	public Director(PizzaBuilderClass pizzaBuilder) {
		this.pizzaBuilder= pizzaBuilder;
	}

	public PizzaBuilderClass getPizzaBuilder() {
		return pizzaBuilder;
	}
	
	public void constructPizza() {
	pizzaBuilder.createNewPizzaProduct();
	pizzaBuilder.buildCheese(true);
	pizzaBuilder.buildOlives(true);
	}
}
