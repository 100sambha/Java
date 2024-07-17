package containment.college;

public class Person {
	private String pName;
	private String pAdharNo;
	private String pJobName;
	private int pJobId;
	private String pJobLocation;
	private Address address;
	private College college;
	
	public Person() {
		super();
	}

	public Person(String pName, String pAdharNo, String pJobName, int pJobId, String pJobLocation, Address address, College college) {
		super();
		this.pName = pName;
		this.pAdharNo = pAdharNo;
		this.pJobName = pJobName;
		this.pJobId = pJobId;
		this.pJobLocation = pJobLocation;
		this.address = address;
		this.college = college;
		
	}
	
	public void displayPersonDetails() {
		System.out.println("Person Name :"+this.pName+"\nAdhar No :"+this.pAdharNo+"\nJob Name :"+this.pJobName+"\nJob ID :"+this.pJobId+"\nLocation :"+this.pJobLocation+"\nAddress :"+this.address+"\nCollege Details :"+this.college.collegeData());
	}
}