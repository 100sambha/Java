package constructors;

public class Rectangle2 {
	private int length;
	private int width;
	
	public Rectangle2() {		
		this.length = 0;
		this.width = 0;
	}
	
	public Rectangle2(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle2(int length) {
		this.length = length;
		this.width = length;
	}
	
	public void reactangleArea() {
		System.out.println("Area Of Rectangle "+this.length*this.width);
	}
	
	public static void main(String[] args) {
		Rectangle2 rec1 = new Rectangle2();
		rec1.reactangleArea();
		Rectangle2 rec2 = new Rectangle2(4,3);
		rec2.reactangleArea();
		Rectangle2 rec3 = new Rectangle2(5);
		rec3.reactangleArea();
	}
}