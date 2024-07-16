package constructors;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double basicSlary;
	
	public Employee() {}

	public Employee(int id, String name, String designation, double basicSlary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.basicSlary = basicSlary;
	}
	
	public double calculateSalary() {
		return basicSlary+(basicSlary*0.25)+(basicSlary*0.20);
	}
	
	public String displayEmployeeData() {
		return "Id :"+this.id+"\nName :"+this.name+"\nDesignation :"+this.designation;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(1,"Sam","Software Engineer",50000);
		System.out.println(e.displayEmployeeData());
		System.out.println("Salary :"+e.calculateSalary());
		
	}
}