
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st methode
		PizzaBuilderClass pizzaBuilder =new Pizza4FromagesPremiereMeth();
		Director di=new Director(pizzaBuilder );
		di.constructPizza();
		System.out.println(di.getPizzaBuilder());
		
		
		//2 nd methode
		PizzaFruitMer2emeMe pi= new PizzaFruitMer2emeMe();
		Pizza pizza = pi.buildCheese(true).buildSize(4).getPizza();
		System.out.println(pizza);
	}

}
