package abstractAndInterface.Shape;

public class MainShape {

	public static void main(String[] args) {
		Shape trapezoid = new Trapezoid();
		trapezoid.numberOfSides();
		
		Shape hexagon = new Hexagon();
		hexagon.numberOfSides();
		
		Shape triangle = new Triangle();
		triangle.numberOfSides();
	}
}