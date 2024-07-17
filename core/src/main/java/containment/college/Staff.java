package containment.college;

public class Staff {
	private String employeeName;
	private Address staffAddress;
	private College collegeAddress;
	
	public Staff() {
		super();
	}
	
	public Staff(String employeeName, Address staffAddress, College collegeAddress) {
		super();
		this.employeeName = employeeName;
		this.staffAddress = staffAddress;
		this.collegeAddress = collegeAddress;
	}
	
	public void displayStaffDetails() {
		System.out.println("Employee Name :"+this.employeeName+"\nStaff Address :"+this.staffAddress+"\nCollege Details :"+this.collegeAddress.collegeData());
	}
}