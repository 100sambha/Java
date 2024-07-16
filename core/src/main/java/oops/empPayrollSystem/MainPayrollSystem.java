package oops.empPayrollSystem;

public class MainPayrollSystem {

	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee(1, "Sambhaji", 50020);
		Employee emp2 = new FullTimeEmployee(2, "Puja",73473);
		Employee emp3 = new PartTimeEmployee(3, "Rudra", 5, 2000);
		Employee emp4 = new PartTimeEmployee(4, "Kishor", 3, 6000);
		
		PayrollSystem payrollSystem = new PayrollSystem();
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.addEmployee(emp3);
		payrollSystem.addEmployee(emp4);
		
		System.out.println("Initial Employee");
		payrollSystem.displayEmployee();
		
		System.out.println("Removing Emplloyee");
		payrollSystem.removeEmployee(3);
				
		System.out.println("Remaining Employee");
		payrollSystem.displayEmployee();
	}

}
