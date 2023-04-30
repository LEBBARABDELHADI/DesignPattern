
public class Tarte {

	private int size;
	private boolean cheese;
	private boolean sucre;
	

	public Tarte() {
	}
	public Tarte(int size, boolean cheese, boolean sucre) {
		this.size = size;
		this.cheese = cheese;
		this.sucre=sucre;
	}
	public boolean isSucre() {
		return sucre;
	}
	
	public void setSucre(boolean sucre) {
		this.sucre = sucre;
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
	
}
