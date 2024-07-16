package methods;

public class Area {

	public Area() {
		super();
	}
	
	public double area(double side) {
		return side*side;
	}
	
	public double area(double length, double breadth) {
		return length*breadth;		
	}
	
	public double area(double side, double length, double breadth) {
		return side * length * breadth;
	}

}