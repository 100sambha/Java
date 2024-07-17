package containment.college;

public class Address {
	private int streetNo;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}
	
	public Address(int streetNo, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "\nStreet No :"+this.streetNo+"\nCity :"+this.city+"\nState :"+this.state+"\nCountry :"+this.country;
	}
}
