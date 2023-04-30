
public abstract class PizzaBuilderClass {

	protected Pizza pizza;
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct() {
		pizza =new Pizza();
	}
	
	public abstract void buildCheese(boolean cheese) ;

	public abstract void buildOlives(boolean  olivee) ;
}
