package abstractAndInterface.Vehicle;

import abstractAndInterface.Shape.Hexagon;
import abstractAndInterface.Shape.Shape;

public class VehicalMain {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.numWheels();
		Vehicle truck = new Truck();
		truck.numWheels();
		
		Shape shape = new Hexagon();
		shape.numberOfSides();
	}
}
