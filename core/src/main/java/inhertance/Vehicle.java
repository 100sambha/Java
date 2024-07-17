package inhertance;

public class Vehicle {
	private String vehicleName;
	private int vehicleModelNumber;
	private double vehiclePrice;
	private String serviceStationName;
	public Vehicle(String vehicleName, int vehicleModelNumber, double vehiclePrice, String serviceStationName) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleModelNumber = vehicleModelNumber;
		this.vehiclePrice = vehiclePrice;
		this.serviceStationName = serviceStationName;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleModelNumber() {
		return vehicleModelNumber;
	}

	public void setVehicleModelNumber(int vehicleModelNumber) {
		this.vehicleModelNumber = vehicleModelNumber;
	}

	public double getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	public String getServiceStationName() {
		return serviceStationName;
	}

	public void setServiceStationName(String serviceStationName) {
		this.serviceStationName = serviceStationName;
	}

	public void display() {
		System.out.println("Vehicle Name :"+vehicleName+"\nModel Number :"+vehicleModelNumber+"\nPrice :"+vehiclePrice+"\nService Station Number :"+serviceStationName);
	}
}