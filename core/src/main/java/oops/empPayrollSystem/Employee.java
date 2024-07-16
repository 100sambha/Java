package oops.empPayrollSystem;

public abstract class Employee {

	private int id;
	private String name;
	
	public Employee() {}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return "Id "+this.id+", Employee Name "+this.name+", Salary "+this.calculateSalary();
	}
}
