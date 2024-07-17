package inhertance;

public class Worker {
	private String sName;
	private int age;
	private String sPhoneNumber;
	private String sAddress;
	private double sSalary;
	
	
	
	public Worker(String sName, int age, String sPhoneNumber, String sAddress, double sSalary) {
		super();
		this.sName = sName;
		this.age = age;
		this.sPhoneNumber = sPhoneNumber;
		this.sAddress = sAddress;
		this.sSalary = sSalary;
	}
	
	public void display() {
		System.out.println("Name "+sName+"\nAge "+age+"\nPhone Number "+sPhoneNumber+"\nAddress "+sAddress);
	}

	public void displaySalary() {
		System.out.println("Salary "+sSalary);
	}
}