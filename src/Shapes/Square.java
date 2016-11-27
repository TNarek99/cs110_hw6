package Shapes;

public class Square {
	private int length;
	
	public Square (int l) {
		this.length = l;
	}
	
	public int getArea() {
		return this.length * this.length;
	}
}
