package psr;

/*Classe para representar uma tupla de int*/

public class Tupla {
	private int first;
	private int second;
	
	public Tupla(int x, int y) {
		this.first = x;
		this.second = y;
	}
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
}
