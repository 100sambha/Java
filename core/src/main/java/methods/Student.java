package methods;

public class Student {
	private int rollNo;
	private String name;
	private String contactNo;
	private double totalMarks;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, String contactNo, double totalMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.contactNo = contactNo;
		this.totalMarks = totalMarks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
}
