
public class Pizza4FromagesPremiereMeth  extends PizzaBuilderClass {
	Pizza pizza;
	public Pizza4FromagesPremiereMeth() {
		pizza =new Pizza();
	}
	
	@Override
	public void buildCheese(boolean cheese) {
		pizza.setCheese(cheese);
		
	}

	@Override
	public void buildOlives(boolean  olivee) {
		pizza.setSale(olivee);
	}
	
	public void buildSize(int size ) {
		pizza.setSize(size);
	}

	@Override
	public String toString() {
		return "Pizza4Fromages [pizza=" + pizza + "]";
	}

}
