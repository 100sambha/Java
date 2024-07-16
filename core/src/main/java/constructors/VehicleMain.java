package constructors;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Vehicle vehicle2 = new Vehicle("Red", 5);
		Vehicle vehicle3 = new Vehicle("Orange", 4, 5);
		vehicle.toString();
		vehicle2.toString();
		vehicle3.toString();
	}
}
