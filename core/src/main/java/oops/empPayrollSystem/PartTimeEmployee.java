package oops.empPayrollSystem;

public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hoursRate;
	
	public PartTimeEmployee(int id, String name, int hoursWorked, double hoursRate) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursRate*hoursWorked;
	}
}