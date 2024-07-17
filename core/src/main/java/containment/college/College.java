package containment.college;

public class College {
	private String collegeName;
	private Address collegeAddress;
	
	public College() {
		super();
	}
	
	public College(String collegeName, Address collegeAddress) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
	
	public String collegeData() {
		return "\nCollege Name :"+this.collegeName+"\nCollege Address :"+this.collegeAddress;
	}	
	
}