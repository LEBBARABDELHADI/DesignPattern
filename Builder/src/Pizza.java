
public class Pizza {

	private int size;
	private boolean cheese;
	private boolean sale;
	
	public Pizza() {
	}
	public Pizza(int size, boolean cheese, boolean sale) {
		this.size = size;
		this.cheese = cheese;
		this.sale=sale;
	}
	public boolean isSale() {
		return sale;
	}
	public void setSale(boolean sale) {
		this.sale = sale;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese=" + cheese + ", sale=" + sale + "]";
	}
	
}
