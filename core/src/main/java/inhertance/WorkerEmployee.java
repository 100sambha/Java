package inhertance;

public class WorkerEmployee extends Worker {
	private String workSpecialization;
	private String department;
	
	public WorkerEmployee(String sName, int age, String sPhoneNumber, String sAddress, double sSalary,
			String workSpecialization, String department) {
		super(sName, age, sPhoneNumber, sAddress, sSalary);
		this.workSpecialization = workSpecialization;
		this.department = department;
	}
	
	public void displayData() {
		super.display();
		System.out.println("Work Specialization "+workSpecialization);		
		System.out.println("Department "+department);
		super.displaySalary();
	}
}