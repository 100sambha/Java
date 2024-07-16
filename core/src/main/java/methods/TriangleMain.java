package methods;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(12, 10, 13, 87, 87, 87);
		triangle.trianglePerimeter();
		triangle.triangleArea();
		triangle.equilateral();
		triangle.isosceles();
		triangle.rightAngled();
	}
}