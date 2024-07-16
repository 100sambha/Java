package constructors;

public class ShapeCircle {
	private float pi = 3.14f;
	private float radius;

	public ShapeCircle(float radius) {
		this.radius = radius;
	}

	public ShapeCircle(float radius,float pi) {
		super();
		this.radius = radius;
		this.pi = pi;
	}
	
	public double circleAreaFinder(){
		return this.pi*(Math.pow(radius, 2));
	}
	
	public double circleCircumferenceFinder() {
		return 2*this.pi*this.radius;
	}
}
