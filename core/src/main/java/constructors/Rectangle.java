package constructors;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void rectangleArea() {
		System.out.println("Area Of Rectangle "+(length*width));
	}
	
	public void rectanglePerimeter() {
		System.out.println("Perimeter Of Rectangle "+((length+width)*2));
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10, 6);
		Rectangle rectangle2 = new Rectangle(3, 4);
		
		rectangle1.rectangleArea();
		rectangle1.rectanglePerimeter();
		
		rectangle2.rectangleArea();
		rectangle2.rectanglePerimeter();
	}
}
