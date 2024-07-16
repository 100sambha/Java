package constructors;

public class Vehicle {
	private String color;
	private int wheelCount;
	private int gearCount;
	
	public Vehicle() {
		super();
		System.out.println("Color : "+this.color);
		System.out.println("Wheel Count : "+this.wheelCount);
		System.out.println("Gear Count : "+this.gearCount);
	}
	
	public Vehicle(String color, int wheelCount, int gearCount) {
		this();
		this.color = color;
		this.wheelCount = wheelCount;
		this.gearCount = gearCount;
		System.out.println(this.toString());
	}
	
	public Vehicle(String color, int gearCount) {
		this();
		this.color = color;
		this.gearCount = gearCount;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + this.color + ", wheelCount=" + this.wheelCount + ", gearCount=" + this.gearCount + "]";
	}	
	
	
}

