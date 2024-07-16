package oops.studentDetails;

public class StudentDemo {
	protected int emp_id;
	public String emp_name;
	private double emp_salary;
	String emp_dept;
	
	public StudentDemo(int emp_id, String emp_name, double emp_salary, String emp_dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_dept = emp_dept;
	}
	
	private String privateStudent() {
		return "Emp Id -"+emp_id+"\nEmp Name -"+emp_name+"\nEmp Salary -"+emp_salary+"\nEmp Dept -"+emp_dept;
	}
	
	public String publicStudent() {
		return "Emp Id -"+emp_id+"\nEmp Name -"+emp_name+"\nEmp Salary -"+emp_salary+"\nEmp Dept -"+emp_dept;
	}
	
	protected String protectedStudent() {
		return "Emp Id -"+emp_id+"\nEmp Name -"+emp_name+"\nEmp Salary -"+emp_salary+"\nEmp Dept -"+emp_dept;
	}

	String defaultStudent() {
		return "Emp Id -"+emp_id+"\nEmp Name -"+emp_name+"\nEmp Salary -"+emp_salary+"\nEmp Dept -"+emp_dept;
	}
	
	
}
