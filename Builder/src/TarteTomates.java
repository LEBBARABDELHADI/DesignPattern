
public class TarteTomates extends PizzaBuilderClass {

	private Tarte tarte;
	
	public TarteTomates(Tarte tarte) {
	this.tarte = new Tarte();
	}

	@Override
	public void buildCheese(boolean cheese) {
		// TODO Auto-generated method stub
		tarte.setCheese(cheese);
		
	}

	@Override
	public void buildOlives(boolean  olivee) {
		tarte.setSucre(!olivee);;
	}
	
	public void buildSize(int size ) {
		tarte.setSize(size);
	}

}
