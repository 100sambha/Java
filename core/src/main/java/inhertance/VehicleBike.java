package inhertance;

public class VehicleBike extends Vehicle {

	private int discountRate;
	
	public VehicleBike(String vehicleName, int vehicleModelNumber, double vehiclePrice, String serviceStationName, int discountRate) {
		super(vehicleName, vehicleModelNumber, vehiclePrice, serviceStationName);
		this.discountRate = discountRate;
	}
	
	public void display() {
		super.display();
		this.discountRatePrice();
	}

	private void discountRatePrice() {
		double discount = super.getVehiclePrice()*(this.discountRate/100.0);
		double price = super.getVehiclePrice()-discount;
		System.out.println("Discount Price :"+price);
	}
}