package methods;

public class Room {
	private double length;
	private double width;
	private double height;
	
	public Room() {	}
	
	public Room(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double whiteWashingArea() {
		return this.length*this.width*this.height;
	}
	
	public double whiteWashingCost() {
		return this.length*this.height*80;
	}
	
	public double flooringCost() {
		return (this.length*this.width*200)+(this.length*this.width*100);
	}

}
