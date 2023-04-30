
public class PizzaFruitMer2emeMe   {
	Pizza pizza;

	public PizzaFruitMer2emeMe() {
		pizza =new Pizza();
	}
	
	public PizzaFruitMer2emeMe buildCheese(boolean cheese) {
		this.pizza.setCheese(cheese);
		return this;
		
	}

	public PizzaFruitMer2emeMe buildOlives(boolean  olivee) {
		this.pizza.setSale(olivee);
		return this;
	}
	public Pizza getPizza() {
		return pizza;
	}
	
	public PizzaFruitMer2emeMe buildSize(int size ) {
		this.pizza.setSize(size);
		return this;
	}
	

	@Override
	public String toString() {
		return "Pizza4Fromages [pizza=" + pizza + "]";
	}

}
