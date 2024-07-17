package inhertance;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePhone;
	private double basicSalary;
	private double specialAllowance;
	private double hra;
	
	public Employee(long employeeId, String employeeName, String employeeAddress, String employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.hra = hra;
	}
	
	public void calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary *this.specialAllowance/100) + (this.basicSalary*this.hra/100);
		System.out.println("Salary :"+salary);
	}
	
	public void displayData() {
		System.out.println("Employee ID : "+this.employeeId);
		System.out.println("Employee Name "+this.employeeName);
		System.out.println("Employee Address "+this.employeeAddress);
		System.out.println("Employee Phone "+this.employeePhone);
		this.calculateSalary();
	}
	
	public void calculateTransportAllowance(double transportAllowance) {
		double ta = transportAllowance;
		if(transportAllowance!=0) {
			ta = transportAllowance/100f*basicSalary;
		}
		else {
			ta = 10/100f*basicSalary;			
		}
		System.out.println("Transport Allowance :"+ta );
	}
	
	
}