package constructors;

public class ShapeCircle_CircleArea {

	public static void main(String[] args) {
		ShapeCircle shapeCircle = new ShapeCircle(5);
		System.out.println("Area Of Circle "+shapeCircle.circleAreaFinder());
		System.out.println("Circumference Of Circle "+shapeCircle.circleCircumferenceFinder());
		ShapeCircle shapeCircle2 = new ShapeCircle(5,3.5f);
		System.out.println("Area Of Circle "+shapeCircle2.circleAreaFinder());		
		System.out.println("Circumference Of Circle "+shapeCircle2.circleCircumferenceFinder());
	}

}
